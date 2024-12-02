package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavascriptUtility.clickJs;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class ElementPage extends HomePage {
  By webTables = By.xpath("//li[@id='item-3']");

  public WebTablesPage clickWebTable() {
    if(!findUsingLocator(webTables).isSelected()) {
      scrollToElementJs(webTables);
      clickJs(webTables);
    }

    return new WebTablesPage();
  }
}
