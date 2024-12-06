package part3.com.demoqa.test.alerts;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.alerts.AlertPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.test.base.BaseTest;

import static com.utilities.SwitchToUtility.*;

public class AlertPageTest extends BaseTest {

  @Test
  public void runAlertTest() {

    HomePage page = new HomePage();
    AlertPage alertPage = page.clickAlert().clickAlertPage();

    //Alert box
    /*alertPage.clickAlertButton();
    String expectedResult = "You clicked a button";
    String actualResult = getAlertText();
    acceptAlert();

    Assert.assertEquals(expectedResult, actualResult,
            "/n Actual result and expected result are different /n");*/

    // Confirm box
    /*alertPage.clickConfirmButton();
    String expectedString = "Do you confirm action?";
    String actualString = getAlertText();
    dismissAlert();
    Assert.assertEquals(expectedString, actualString,
            "/n Actual result and expected result are different /n");
    String expectedMessage = "You selected Cancel";
    String actualMessage = alertPage.getConfirmBoxResult();
    Assert.assertEquals(expectedMessage, actualMessage,
            "/n Actual result and expected result are different /n");
  */

    // Prompt box
    alertPage.clickPromptButton();
    String name = "Souradip Saha";
    sendAlertKeys(name);
    acceptAlert();
    String expectedName = alertPage.getPromptButtonResult();
    Assert.assertTrue(expectedName.contains(name),
            "\n Expected name and actual name doesn't match \n");
  }
}
