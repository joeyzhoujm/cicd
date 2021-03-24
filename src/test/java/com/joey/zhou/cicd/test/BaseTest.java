package com.joey.zhou.cicd.test;

import com.codeborne.selenide.Configuration;
import com.joey.zhou.cicd.CicdApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeSuite;

@SpringBootTest(classes = CicdApplication.class)
public class BaseTest extends AbstractTestNGSpringContextTests {

    @BeforeSuite
    protected void configureWebDriver() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "";
    }

}
