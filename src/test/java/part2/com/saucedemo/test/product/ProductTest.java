package part2.com.saucedemo.test.product;

import com.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductTest extends BaseTest {

  @Test
  public void setup(){
    ProductPage page = loginPage.logIntoApplication("standard_user","secret_sauce");
    Assert.assertTrue(page.isProductHeaderDisplayed(), "\n Product is not displayed \n");
    // Assert.assertFalse(page.isProductHeaderDisplayed(), "\n Product is not displayed \n"); // In case of error
  }
}
