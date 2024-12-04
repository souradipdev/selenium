package part3.com.demoqa.test.elements;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.elements.WebTablesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.test.base.BaseTest;

public class WebTablesTest extends BaseTest {

  @Test
  public void runTest() {
    HomePage page = new HomePage();
    WebTablesPage table = page.clickElements().clickWebTable();

    String email = "alden@example.com";
    table.clickEdit(email);
    table.setEditAge("20");
    table.setEditSalary("75000");
    table.submit();

    String actualAge = "20";
    String expectedAge = table.getEditedAge(email);
    Assert.assertEquals(expectedAge, actualAge, "\n Expected age not same as actual age \n");

    String actualSalary = "75000";
    String expectedSalary = table.getNewSalary(email);
    Assert.assertEquals(expectedSalary, actualSalary, "\n Expected salary and actual salary are not same");
  }
}
