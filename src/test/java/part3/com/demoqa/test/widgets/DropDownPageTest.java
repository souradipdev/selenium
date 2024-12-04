package part3.com.demoqa.test.widgets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.widgets.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.test.base.BaseTest;

import java.util.List;

public class DropDownPageTest extends BaseTest {

  @Test
  public void runDropdownTest() {
    HomePage page = new HomePage();
    DropDownPage dropDownMenu = page.clickWidgets().clickSelectMenu();
    dropDownMenu.selectStandardMulti("Volvo");
    dropDownMenu.selectStandardMulti(2);
    dropDownMenu.selectStandardMulti(1);
    dropDownMenu.selectStandardMulti(3);

    dropDownMenu.deselectStandardMultiselectValue("audi");
    List<String> actualSelectedOptions = dropDownMenu.getAllSelectedStandardMultiOptions();

    Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
    Assert.assertTrue(actualSelectedOptions.contains("Opel"));
    Assert.assertTrue(actualSelectedOptions.contains("Saab"));
    Assert.assertFalse(actualSelectedOptions.contains("Audi"),
            "\n Saab Is Selected As An Option \n");
  }

}
