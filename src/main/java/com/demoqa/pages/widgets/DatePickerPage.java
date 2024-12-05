package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static com.utilities.DropDownUtility.selectByVisibleText;

public class DatePickerPage extends WidgetsPage {
  By datePickerInput = By.id("datePickerMonthYearInput");
  By monthDropdown = By.className("react-datepicker__month-select");
  By yearDropdown = By.id("react-datepicker__year-select");

  public By getBy(String day) {
    return By.className("react-datepicker__day react-datepicker__day--0" + day);
  }

  public void selectDate(String date) {
    clickUsingLocator(getBy(date));
  }

  public boolean isDayInMonth(String date) {
    return findUsingLocator(getBy(date)).isDisplayed();
  }

  public void clickDatePickerInput() {
    clickUsingLocator(datePickerInput);
  }

  public void selectMonth(String month) {
    selectByVisibleText(monthDropdown, month);
  }

  public void selectYear(String year) {
    selectByVisibleText(yearDropdown, year);
  }

  public String getDate() {
    return findUsingLocator(datePickerInput).getAttribute("value");
  }
}
