package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility {

  private static WebDriver.TargetLocator switchTo() {
    return driver.switchTo();
  }

  public static String getAlertText() {
    return switchTo().alert().getText();
  }

  public static void acceptAlert() {
    switchTo().alert().accept();
  }

  public static void dismissAlert() {
    switchTo().alert().dismiss();
  }

  public static void sendAlertKeys(String text) {
    switchTo().alert().sendKeys(text);
  }

  public static void switchToFrameString(String nameOrId) {
    switchTo().frame(nameOrId);
  }

  public static void switchToDefaultContext() {
    switchTo().defaultContent();
  }

  public static void switchToFrameIndex(int index) {
    switchTo().frame(index);
  }

  public static void switchToFrameElement(WebElement element) {
    switchTo().frame(element);
  }

}
