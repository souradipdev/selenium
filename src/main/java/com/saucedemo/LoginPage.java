package com.saucedemo;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

  private By userNameField = By.id("user-name");
  private By passwordField = By.id("password");

  private By LoginButton = By.className("submit-button btn_action");

  private By errorMessage = By.cssSelector("error-message-container error h3");

  public void setUserNameField(String username) {
    set(userNameField, username);
  }

  public void setPasswordField(String password) {
    set(passwordField, password);
  }

  public ProductPage loginButton() {
    click(LoginButton);
    return new ProductPage();
  }

  public ProductPage logIntoApplication(String username, String password) {
    setUserNameField(username);
    setPasswordField(password);
    return loginButton();
  }

  public void getErrorMessage(){
    WebElement error = driver.findElement(errorMessage);
    error.getText();
  }
}
