package part3.com.demoqa.test.base;

import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;

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
//    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    basePage.setDriver(driver, wait);
    basePage.setDriver(driver);
  }

  @AfterMethod
  public void takeFailedResultScreenshot(ITestResult testResult) {
    if (ITestResult.FAILURE == testResult.getStatus()) {
      try {
        if (driver == null) {
          throw new IllegalStateException("WebDriver is not initialized.");
        }

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File screenshotDir = new File(System.getProperty("user.dir") + "/resources/screenshots/");
        if (!screenshotDir.exists()) {
          screenshotDir.mkdirs();
        }

        String timestamp = java.time.LocalDateTime.now().toString().replace(":", "-");
        File destination = new File(screenshotDir, "(" + timestamp + ") " + testResult.getName() + ".png");

        Files.copy(source.toPath(), destination.toPath());
        System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
      } catch (Exception e) {
        e.printStackTrace();
        throw new RuntimeException("Failed to take screenshot: " + e.getMessage(), e);
      }
    }
  }


  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
