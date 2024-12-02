package part3.com.demoqa.test.form;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.form.PractiseFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
  HomePage homepage;
  PractiseFormPage practiseFormPage;

  @Test
  public void runTest() {
    homepage = new HomePage();
    practiseFormPage = homepage.clickForm();
    practiseFormPage.clickPractiseForm();
    practiseFormPage.clickFemaleRadioButton();
    boolean val = practiseFormPage.verifyFemaleRadioClicked();

    Assert.assertTrue(val, "\n Female radio button is not selected \n");
  }
}
