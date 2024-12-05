package part3.com.demoqa.test.widgets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.widgets.DatePickerPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.test.base.BaseTest;

public class DatePickerPageTest extends BaseTest {

  @Test
  public void testDatePicker() {
    HomePage page = new HomePage();
    DatePickerPage datePicker = page.clickWidgets().clickDatePickerPage();

    String monthNumber = "01";
    String day = "18";
    String year = "2004";
    datePicker.clickDatePickerInput();
    datePicker.selectMonth("January");
    datePicker.selectYear("2004");
    datePicker.selectDate("18");

    String actualDate = datePicker.getDate();
    String expectedDate = monthNumber + "/" + day + "/" + year;
    Assert.assertEquals(actualDate, expectedDate,
            "\n Actual & Expected Dates Do Not Match" +
                    "\n Actual Date:   " + actualDate +
                    "\n Expected Date: " + expectedDate + "\n");
  }
}
