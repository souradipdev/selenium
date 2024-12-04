package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavascriptUtility.clickJs;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class WidgetsPage extends HomePage {
  By selectMenuButton = By.id("item-8");

  public DropDownPage clickSelectMenu() {
    if (!findUsingLocator(selectMenuButton).isSelected()) {
      scrollToElementJs(selectMenuButton);
      clickJs(selectMenuButton);
    }
    return new DropDownPage();
  }

}
