package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

  public static WebDriver driver;
  public static WebDriverWait wait;

  public void setDriver(WebDriver driver) {
    BasePage.driver = driver;
  }

  protected WebElement find(By locator) {
    return driver.findElement(locator);
  }

  protected void set(By locator, String text) {
    find(locator).clear();
    find(locator).sendKeys(text);

  }

  protected void click(By locator) {
    find(locator).click();
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
