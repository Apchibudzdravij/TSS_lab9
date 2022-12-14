package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import page.GalaxystoreHomePage;

public class GalaxystoreTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = getDriver();
    }
    private WebDriver getDriver() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        return new ChromeDriver(options);
    }

    @Test
    @DisplayName("Test: go to s22 catalog page with 404")
    void goToSmartphone() throws InterruptedException {
        GalaxystoreHomePage galaxystoreHomePage =
                new GalaxystoreHomePage(driver).openPage()
                        .smartphoneButtonClick()
                        .m21ButtonClick();
        Assertions.assertEquals(
                "https://galaxystore.by/product/sm-m127fzkuser",
                galaxystoreHomePage.getPageUrl());
    }

    @AfterEach
    @DisplayName("Close Chrome Driver")
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
