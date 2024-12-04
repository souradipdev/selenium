package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavascriptUtility.clickJs;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class WidgetsPage extends HomePage {
  By selectMenuButton = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
  By selectDatePickerButton = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");

  public DropDownPage clickSelectMenu() {

    scrollToElementJs(selectMenuButton);
    clickJs(selectMenuButton);

    return new DropDownPage();
  }

  public DatePickerPage clickDatePickerPage() {
    scrollToElementJs(selectDatePickerButton);
    clickJs(selectDatePickerButton);

    return new DatePickerPage();
  }
}
