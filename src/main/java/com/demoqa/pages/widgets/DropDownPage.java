package com.demoqa.pages.widgets;

import com.base.BasePage;
import org.openqa.selenium.By;

import java.util.List;

import static com.utilities.DropDownUtility.*;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class DropDownPage extends BasePage {

  private By standardMultiSelect = By.id("cars");

  public void selectStandardMulti(String text) {
    scrollToElementJs(standardMultiSelect);
    selectByVisibleText(standardMultiSelect, text);
  }

  public void selectStandardMulti(int index) {
    scrollToElementJs(standardMultiSelect);
    selectByIndex(standardMultiSelect, index);
  }

  public void selectOptionByValue(String value) {
    scrollToElementJs(standardMultiSelect);
    selectByValue(standardMultiSelect, value);
  }

  public void deselectStandardMultiselectOption(String option) {
    scrollToElementJs(standardMultiSelect);
    deselectByValue(standardMultiSelect, option);
  }

  public List<String> getAllSelectedStandardMultiOptions() {
    scrollToElementJs(standardMultiSelect);
    return getAllSelectedOptions(standardMultiSelect);
  }
}
