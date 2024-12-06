package com.demoqa.pages.alerts;

import org.openqa.selenium.By;

public class AlertPage extends AlertFrameWindowsPage {

  private By alertButton = By.id("alertButton");
  private By confirmButton = By.id("confirmButton");
  private By promptButton = By.id("promtButton");

  public void clickAlertButton() {
    clickUsingLocator(alertButton);
  }

  public void clickConfirmButton() {
    clickUsingLocator(confirmButton);
  }

  public String getConfirmBoxResult() {
    return findUsingLocator(By.id("confirmResult")).getText();
  }

  public void clickPromptButton() {
    clickUsingLocator(promptButton);
  }

  public String getPromptButtonResult() {
    return findUsingLocator(By.id("promptResult")).getText();
  }

}
