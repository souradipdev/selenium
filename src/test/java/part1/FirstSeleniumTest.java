package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

  WebDriver driver;
  WebDriverWait wait;

  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    // Initialize WebDriverWait with a timeout
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void testLoggingIntoApplication() {
    // Wait for the username field to be present and visible
    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    username.sendKeys("Admin");

    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("admin123");

    WebElement loginButton = driver.findElement(By.tagName("button"));
    loginButton.click();

    // Wait for the dashboard header to appear and verify it
    WebElement dashboardHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h6")));
    String actualResult = dashboardHeader.getText();
    String expectedResult = "Dashboard";
    Assert.assertEquals(actualResult, expectedResult, "Login failed or incorrect page loaded.");
//    Assert.assertNotEquals(actualResult, expectedResult, "Login failed or incorrect page loaded.");
  }
}
