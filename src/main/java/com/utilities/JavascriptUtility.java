package com.utilities;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtility extends Utility {
  public static void scrollToElementJs(By locator) {
    WebElement element = driver.findElement(locator);
    String jsScript = "arguments[0].scrollIntoView();";
    JavascriptExecutor executor = (JavascriptExecutor) driver;

    executor.executeScript(jsScript, element);
  }

  public static void clickElement(By locator) {
    WebElement element = driver.findElement(locator);
    String jsScript = "arguments[0].click()";
    JavascriptExecutor executor = (JavascriptExecutor) driver;

    executor.executeScript(jsScript, element);
  }

}
