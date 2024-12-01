package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

  private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
  private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
  private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
  private By alertsFrameWindowsCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");

  public void click() {
    WebElement form = driver.findElement(formsCard);
    form.click();
  }
}
