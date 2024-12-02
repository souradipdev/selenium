package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.form.PractiseFormPage;
import com.utilities.JavascriptUtility;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

  private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
  private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
  private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
  private By alertsFrameWindowsCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

  public PractiseFormPage clickForm() {
    JavascriptUtility.setUtilityDriver();
    JavascriptUtility.scrollToElementJs(formsCard);
    JavascriptUtility.clickJs(formsCard);
    return new PractiseFormPage();
  }
}
