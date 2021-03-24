package com.joey.zhou.cicd.test;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;


import com.joey.zhou.cicd.CicdApplication;


@Slf4j
@SpringBootTest(classes = CicdApplication.class)
public class SearchBaiduTest extends BaseTest {

    @Test
    public void test() {
        open("http://www.baidu.com");
        $(By.xpath("//input[@id='kw']")).setValue("Joey");
        $(By.xpath(".//*[@id='su']")).click();
        sleep(5000);
        log.debug("Test completed");
        log.debug("Title name is: " + title());
        }
}
