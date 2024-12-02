package part3.com.demoqa.base;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
  private WebDriver driver;
  private WebDriverWait wait;
  protected BasePage basePage;
  private String DEMOQA_URL = "https://demoqa.com/";

  @BeforeClass
  public void setup() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @BeforeMethod
  public void loadApplication() {
    driver.get(DEMOQA_URL);
    basePage = new BasePage();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    basePage.setDriver(driver, wait);
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    driver.quit();
  }
}
