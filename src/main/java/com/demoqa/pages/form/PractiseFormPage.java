package com.demoqa.pages.form;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;


import static com.utilities.JavascriptUtility.clickJs;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class PractiseFormPage extends HomePage {

  private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
  private By sportsCheckbox = By.id("hobbies-checkbox-1");
  private By readingCheckbox = By.id("hobbies-checkbox-2");
  private By musicCheckbox = By.id("hobbies-checkbox-3");
  private By submitButton = By.id("submit");
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

  public void clickSportsCheckbox() {
    if (!findUsingLocator(sportsCheckbox).isSelected()) {
      scrollToElementJs(sportsCheckbox);
      clickJs(sportsCheckbox);
    }
  }

  public boolean verifySportsCheckbox() {
    return findUsingLocator(sportsCheckbox).isSelected();
  }

  public void clickMusicCheckbox() {
    if (!findUsingLocator(musicCheckbox).isSelected()) {
      scrollToElementJs(musicCheckbox);
      clickJs(musicCheckbox);
    }
  }

  public boolean verifyMusicCheckbox() {
    return findUsingLocator(musicCheckbox).isSelected();
  }

  public void clickReadingCheckbox() {
    if (!findUsingLocator(readingCheckbox).isSelected()) {
      scrollToElementJs(readingCheckbox);
      clickJs(readingCheckbox);
    }
  }

  public boolean verifyReadingCheckbox() {
    return findUsingLocator(readingCheckbox).isSelected();
  }

  public void submit() {
    if (!findUsingLocator(submitButton).isSelected()) {
      scrollToElementJs(submitButton);
      clickJs(submitButton);
    }
  }

  public boolean verifySubmitted() {
    return findUsingLocator(submitButton).isSelected();
  }
}
