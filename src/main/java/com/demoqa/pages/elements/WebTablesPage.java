package com.demoqa.pages.elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementPage {

  By editAge = By.id("age");
  By editSalary = By.id("salary");
  By submit = By.id("submit");

  public void clickEdit(String email) {
    By edit = By.xpath("//div[text()=' " + email + "']//following::span");
    clickUsingLocator(edit);
  }

  public void setEditAge(String age) {
    setKeys(editAge, age);
  }

  public void setEditSalary(String salary) {
    setKeys(editSalary, salary);
  }

  public void submit() {
    clickUsingLocator(submit);
  }

  public String getEditedAge(String email) {
    By editedAge = By.xpath("//div[text()=' " + email + " ']//preceding::div[1]");
    return findUsingLocator(editedAge).getText();
  }
}
