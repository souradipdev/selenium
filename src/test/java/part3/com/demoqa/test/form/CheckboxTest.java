package part3.com.demoqa.test.form;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.form.PractiseFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
  HomePage homePage;
  PractiseFormPage practiseFormPage;

  @Test
  public void checkBoxTest() {
    homePage = new HomePage();
    practiseFormPage = homePage.clickForm();
    practiseFormPage.clickPractiseForm();

    practiseFormPage.clickSportsCheckbox();
    boolean sportsClicked = practiseFormPage.verifySportsCheckbox();
    Assert.assertTrue(sportsClicked);

    practiseFormPage.clickMusicCheckbox();
    boolean musicClicked = practiseFormPage.verifyMusicCheckbox();

    practiseFormPage.clickReadingCheckbox();
    boolean readingClicked= practiseFormPage.verifyReadingCheckbox();

    practiseFormPage.submit();
    boolean isSubmitted = practiseFormPage.verifySubmitted();
  }
}
