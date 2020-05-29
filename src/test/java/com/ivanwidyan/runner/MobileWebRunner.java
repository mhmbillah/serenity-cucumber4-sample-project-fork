package com.ivanwidyan.runner;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MobileWebRunner {

    // chrome, firefox, appium, remote
    @Managed(driver = "appium")
    WebDriver driver;

    @Test
    public void testAutothon() {
    }
}