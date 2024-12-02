package com.demoqa.pages.form;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;


import static com.utilities.JavascriptUtility.clickJs;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class PractiseFormPage extends HomePage {

  private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

  private By femaleRadioButton = By.id("gender-radio-2");

  public void clickPractiseForm() {
    clickUsingLocator(practiceFormMenuItem);
  }

  public void clickFemaleRadioButton() {
    if (!findUsingLocator(femaleRadioButton).isSelected()) {
      scrollToElementJs(femaleRadioButton);
      clickJs(femaleRadioButton);
    }
  }

  public boolean verifyFemaleRadioClicked() {
    return findUsingLocator(femaleRadioButton).isSelected();
  }

}
