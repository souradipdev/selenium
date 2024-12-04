package com.demoqa.pages.widgets;
import org.openqa.selenium.By;

import java.util.List;

import static com.utilities.DropDownUtility.*;
import static com.utilities.JavascriptUtility.scrollToElementJs;

public class DropDownPage extends WidgetsPage {

  private By standardMultiSelect = By.name("cars");

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

  public void deselectStandardMultiselectValue(String value) {
    scrollToElementJs(standardMultiSelect);
    deselectByValue(standardMultiSelect, value);
  }

  public List<String> getAllSelectedStandardMultiOptions() {
    scrollToElementJs(standardMultiSelect);
    return getAllSelectedOptions(standardMultiSelect);
  }
}
