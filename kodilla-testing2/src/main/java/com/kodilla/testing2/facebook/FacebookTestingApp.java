package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String FACEBOOK = "https://www.facebook.com";
    private static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    private static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    private static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    private static final String XPATH_INPUT_FIRSTNAME = "//div[contains(@class, \"_58mh\")]/div[1]/div/div/input[1]";
    private static final String XPATH_INPUT_SURNAME = "//div[contains(@class, \"_58mh\")]/div[2]/div/div/input[1]";
    private static final String XPATH_INPUT_EMAIL = "//div[contains(@class, \"mbm _a4y\")]/div/div/input[1]";
    private static final String XPATH_INPUT_PASSWORD = "//div[contains(@class, \"mbm _br- _a4y\")]/div/div/input[1]";
    private static final String XPATH_EMAIL = "//*[@id=\"u_0_t\"]";
    private static final String XPATH_INPUT_SEX = "//div[contains(@class, \"mtm _5wa2 _5dbb\")]/span/span[2]/input";
    private static final String FIRSTNAME = "Mariusz";
    private static final String SURNAME = "Gebel";
    private static final String EMAIL = "mariuszgebel77@gmail.com";
    private static final String PASSWORD = "kodilla123";
    private static final String DAY = "1";
    private static final String MONTH = "1";
    private static final String YEAR = "2000";

    public static void main(String[] args) {

            WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
            driver.get(FACEBOOK);
            WebElement inputNameField = driver.findElement(By.xpath(XPATH_INPUT_FIRSTNAME));
            inputNameField.sendKeys(FIRSTNAME);
            WebElement inputSurnameField = driver.findElement(By.xpath(XPATH_INPUT_SURNAME));
            inputSurnameField.sendKeys(SURNAME);
            WebElement inputEmailField = driver.findElement(By.xpath(XPATH_INPUT_EMAIL));
            inputEmailField.sendKeys(EMAIL);
            WebElement inputConfEmailField = driver.findElement(By.xpath(XPATH_EMAIL));
            inputConfEmailField.sendKeys(EMAIL);
            WebElement inputPasswordField = driver.findElement(By.xpath(XPATH_INPUT_PASSWORD));
            inputPasswordField.sendKeys(PASSWORD);
            WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
            Select selectDayBoard = new Select(selectComboDay);
            selectDayBoard.selectByValue(DAY);
            WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
            Select selectMonthBoard = new Select(selectComboMonth);
            selectMonthBoard.selectByValue(MONTH);
            WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
            Select selectYearBoard = new Select(selectComboYear);
            selectYearBoard.selectByValue(YEAR);
            WebElement inputSex = driver.findElement(By.xpath(XPATH_INPUT_SEX));
            inputSex.click();
        }
    }

