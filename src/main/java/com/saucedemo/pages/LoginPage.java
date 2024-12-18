package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

  private By userNameField = By.id("user-name");
  private By passwordField = By.id("password");
  private By LoginButton = By.cssSelector(".submit-button.btn_action");
  private By errorMessage = By.cssSelector(".error-message-container h3");

  public void setUserNameField(String username) {
    setKeys(userNameField, username);
  }

  public void setPasswordField(String password) {
    setKeys(passwordField, password);
  }

  public ProductPage clickLoginButton() {
    clickUsingLocator(LoginButton);
    return new ProductPage();
  }

  public ProductPage logIntoApplication(String username, String password) {
    setUserNameField(username);
    setPasswordField(password);
    return clickLoginButton();
  }

  public String getErrorMessage() {
    WebElement error = findUsingLocator(errorMessage);
    return error.getText();
  }
}
