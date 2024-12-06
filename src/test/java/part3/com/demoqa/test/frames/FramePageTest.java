package part3.com.demoqa.test.frames;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.alerts.FramePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.test.base.BaseTest;

import static com.utilities.SwitchToUtility.switchToDefaultContext;

public class FramePageTest extends BaseTest {

  @Test
  public static void runFrameTest() {
    HomePage page = new HomePage();
    FramePage framePage = page.clickAlert().clickFramePage();

    String expectedText = "This is a sample page";
    String actualText = framePage.getBigFrameText();

    Assert.assertEquals(actualText, expectedText,
            "\n Expected BigFrame text does not match actual text \n");
    switchToDefaultContext();

    String expectedHeading = "Sample Iframe page There are 2 Iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame, which is this window, and the two frames below";

    String actualHeading = framePage.getHeaderText();
    Assert.assertEquals(actualHeading, expectedHeading,
            "\n Expected Heading does not match Actual Heading \n");
  }

  @Test
  public void smallFrameBoxTest() {
    HomePage page = new HomePage();
    FramePage framePage = page.clickAlert().clickFramePage();

    String expectedSmallBoxText = "This is a sample page";
    String actualSmallBoxText = framePage.getSmallFrameText();
    Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText,
            "\n Expected SmallFrame text does not match actual text \n");
    switchToDefaultContext();

  }
}
