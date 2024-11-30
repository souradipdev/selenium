package com.saucedemo;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
  private By productHeader = By.xpath("");

  public boolean isProductHeaderDisplayed(){
    return find(productHeader).isDisplayed();
  }
}
