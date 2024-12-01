package part3.com.demoqa.base;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
  private WebDriver driver;
  private WebDriverWait wait;
  protected BasePage basePage;
  protected HomePage homepage;
  private String DEMOQA_URL = "https://demoqa.com/";

  @BeforeClass
  public void setup() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get(DEMOQA_URL);
    basePage = new BasePage();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    basePage.setDriver(driver, wait);
  }

  /*@BeforeMethod
  public void loadApplication() {
    driver.get(DEMOQA_URL);
    basePage = new BasePage();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    basePage.setDriver(driver, wait);
  }*/

  @AfterClass
  public void tearDown(){
//    driver.quit();
  }

  @Test
  public void runTest(){

    homepage = new HomePage();
    homepage.click();
  }
}
