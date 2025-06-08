package com.gyan.selenium.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDataModel {
    private String testcaseId;
    private String testcaseDescription;
    private TestType testType;
    private BrowserType browserType;
    private List<String> steps;
    private Map<String, Map<String, Map<String, Object>>> pages;

}

/*
 * tcId: 001
 * loginPage:
 *   email:
 *   password:
 * */


