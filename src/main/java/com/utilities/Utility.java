package com.utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {
  public static WebDriver driver;

  public void setUtilityDriver(){
    driver = BasePage.driver;
  }

}
