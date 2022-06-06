package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {

////////////// TESTS ///////////////
	@Test
	public void LoginFailureTest() {
		test = report.startTest("LoginFailureTest");
		
		LoginPage login = new LoginPage();
		login.LoginFunction("abc@qwe.com", "Xyzabcd@1234");

		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMsg.getText();
		String ExpeMsg = "The email or password you have entered is invalid.";

		if (ActualMsg.equals(ExpeMsg)) {
			System.out.println("TC Passed");

		} else {
			System.out.println("TC Failed");
		}
		
		report.endTest(test);

	}

//////////LOGIN SUCESS TEST/////////////

	@Test
	public void LoginSucessTest() {
		test = report.startTest("LoginSucessTest");
		
		LoginPage login = new LoginPage();
		login.LoginFunction("aboliwagh.com", "Airforce@1");
		
		report.endTest(test);

	}
	
	@Test
	@Parameters({"Param1","Param2"})
	public void parameterizedTest(String UserNameVal, String PasswordVal) {
		test = report.startTest("parameterizedTest");
		
		LoginPage login = new LoginPage();
		login.LoginFunction(UserNameVal, PasswordVal);
		
		report.endTest(test);
	}
	
	@Test
	public void ExcelDataTest() {
		test = report.startTest("ExcelDataTest");
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage login = new LoginPage();
		login.LoginFunction(UserNameVal, PasswordVal);
		
		report.endTest(test);
		
	}

}
