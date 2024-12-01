package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
  private By productHeader = By.cssSelector(".title");

  public boolean isProductHeaderDisplayed(){
    return find(productHeader).isDisplayed();
  }
}
