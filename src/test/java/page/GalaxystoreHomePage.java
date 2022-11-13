package page;
/*
 * ♡♡♡♡♡♡♡♡♡♡♡
 * ♡(￣ε￣＠) Love u all ♡
 * ♡♡♡♡♡♡♡♡♡♡
 */

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class GalaxystoreHomePage extends BasePage {
    private static final String HOMEPAGE_URL = "https://galaxystore.by/";

    @FindBy(xpath = "//*[@class='home-categories__item ddl_campaign ddl_campaign_link']/div/div[text()='Смартфоны']/../..")
    private WebElement smartphoneButton;
    @FindBy(xpath = "//*[@href='/product/sm-m127fzkuser']")
    private WebElement m12Button;

    public GalaxystoreHomePage(WebDriver driver) {
        super(driver);
    }

    public GalaxystoreHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public  GalaxystoreHomePage smartphoneButtonClick() throws InterruptedException {
        new WebDriverWait(driver, 10).until(
                        ExpectedConditions.elementToBeClickable(smartphoneButton));
        smartphoneButton.click();
        return this;
    }
    public GalaxystoreHomePage m21ButtonClick() throws InterruptedException {
        new WebDriverWait(driver, 10).until(
                        ExpectedConditions.elementToBeClickable(m12Button));
        m12Button.click();
        return this;
    }
}
