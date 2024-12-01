package part2.com.saucedemo.base;

import com.base.BasePage;
import com.saucedemo.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

  protected  WebDriver driver;
  protected BasePage basePage;
  protected LoginPage loginPage;
  private String url = "https://www.saucedemo.com";

  @BeforeClass
  public void setUp(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
    basePage = new BasePage();
    basePage.setDriver(driver);
    loginPage = new LoginPage();
  }

  @AfterClass
  public void teardown(){
    driver.quit();
  }

}
