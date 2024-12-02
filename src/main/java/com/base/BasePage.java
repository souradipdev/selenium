package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

  public static WebDriver driver;
  public static WebDriverWait wait;

  public void setDriver(WebDriver driver, WebDriverWait wait) {
    BasePage.driver = driver;
    BasePage.wait = wait;
  }

  protected WebElement findUsingLocator(By locator) {
    return driver.findElement(locator);
  }

  protected void setKeys(By locator, String text) {
    findUsingLocator(locator).clear();
    findUsingLocator(locator).sendKeys(text);

  }

  protected void clickUsingLocator(By locator) {
    findUsingLocator(locator).click();
  }


  public static void delay(int sec) {
    try {
      wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//some_xpath")));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
