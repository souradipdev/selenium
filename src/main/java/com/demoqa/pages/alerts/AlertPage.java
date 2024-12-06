package com.demoqa.pages.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertPage extends AlertFrameWindowsPage {

  private By alertButton = By.id("alertButton");
  private By confirmButton = By.id("confirmButton");
  private By promptButton = By.id("promtButton");

  private WebElement getBy(String id) {
    return findUsingLocator(By.id(id));
  }

  public void clickAlertButton() {
    clickUsingLocator(alertButton);
  }

  public void clickConfirmButton() {
    clickUsingLocator(confirmButton);
  }

  public String getConfirmBoxResult() {
    return getBy("confirmResult").getText();
  }

  public void clickPromptButton() {
    clickUsingLocator(promptButton);
  }

  public String getPromptButtonResult() {
    return getBy("promptResult").getText();
  }
}
