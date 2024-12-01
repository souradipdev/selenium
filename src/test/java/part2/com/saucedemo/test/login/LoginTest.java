package part2.com.saucedemo.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {

  @Test
  public void testLoginErrorMessage() {
    loginPage.logIntoApplication("standard_user", "1234");
//    loginPage.clickLoginButton();
    String actualMesssage = loginPage.getErrorMessage();
    Assert.assertTrue(actualMesssage.contains("Epic sadface"));

  }
}
