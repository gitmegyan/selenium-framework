package com.gyan.selenium.test.dataprovider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gyan.selenium.models.TestDataModel;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.List;

public class TestDataProvider {

    private static final String TEST_DATA_FOLDER_PATH = "src/test/resources/testdata";

    public Object[] getTestData(Method method) {
        ObjectMapper objectMapper = new ObjectMapper();
        String testMethodName = method.getName();
        String filePath = Paths.get(TEST_DATA_FOLDER_PATH, testMethodName + ".yml").toString();

        try {
            List<TestDataModel> testDataList = objectMapper.readValue(
                    new File(filePath),
                    new TypeReference<List<TestDataModel>>() {}
            );

            return testDataList.toArray();

        } catch (IOException e) {
            throw new RuntimeException("Failed to read test data from file: " + filePath, e);
        }
    }
}