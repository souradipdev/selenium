package com.demoqa.pages.alerts;

import org.openqa.selenium.By;

import static com.utilities.SwitchToUtility.*;

public class FramePage extends AlertFrameWindowsPage {

  private By headerText = By.xpath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]");
  private By textInFrame = By.id("sampleHeading");
  private String frameId = "frame1";
  private By smallBoxText = By.xpath("//h1[@id='sampleHeading']");

  public String getBigFrameText() {
    switchToFrameString(frameId);
    return findUsingLocator(textInFrame).getText();
  }

  public String getHeaderText() {
    return findUsingLocator(headerText).getText();
  }

  public String getSmallFrameText() {
//    switchToFrameIndex(2);
    switchToFrameString(frameId);
    return findUsingLocator(smallBoxText).getText();
  }

}
