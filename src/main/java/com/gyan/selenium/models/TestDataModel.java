package com.gyan.selenium.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDataModel {
    private String testcaseId;
    private String testcaseDescription;
    private TestType testType;
    private BrowserType browserType;

}



