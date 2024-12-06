package com.demoqa.pages.alerts;

import com.base.BasePage;
import org.openqa.selenium.By;

import static com.utilities.JavascriptUtility.clickJs;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class AlertFrameWindowsPage extends BasePage {
  private By alertsButton = By.xpath("//li[@id='item-1']/span[text()='Alerts']");

  public AlertPage clickAlertPage() {
    scrollToElementJs(alertsButton);
    clickJs(alertsButton);
    return new AlertPage();
  }
}
