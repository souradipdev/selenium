package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.alerts.AlertFrameWindowsPage;
import com.demoqa.pages.elements.ElementPage;
import com.demoqa.pages.form.PractiseFormPage;
import com.demoqa.pages.widgets.WidgetsPage;
import com.utilities.JavascriptUtility;
import org.openqa.selenium.By;

import static com.utilities.JavascriptUtility.clickJs;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class HomePage extends BasePage {

  private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
  private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
  private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
  private By alertsFrameWindowsCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

  public PractiseFormPage clickForm() {
    scrollToElementJs(formsCard);
    JavascriptUtility.clickJs(formsCard);
    return new PractiseFormPage();
  }

  public ElementPage clickElements() {
    scrollToElementJs(elementsCard);
    clickJs(elementsCard);
    return new ElementPage();
  }

  public WidgetsPage clickWidgets() {
    scrollToElementJs(widgetsCard);
    clickJs(widgetsCard);
    return new WidgetsPage();
  }

  public AlertFrameWindowsPage clickAlert() {
    scrollToElementJs(alertsFrameWindowsCard);
    clickJs(alertsFrameWindowsCard);
    return new AlertFrameWindowsPage();
  }
}
