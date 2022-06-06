package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {

	WebDriver driver = BaseClass.driver;

	ExtentTest test = BaseClass.test;

	// =============== Web Elements =====================//
	@FindBy(className = "login")
	WebElement LoginLink;

	@FindBy(name = "user_login")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(name = "btn_login")
	WebElement LoginButton;

	@FindBy(className = "rememberMe")
	WebElement RememberMe;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	// =============== Functions =====================//
	public void LoginFunction(String UserNameVal, String PasswordVal) {

		// WebElement LoginLink = driver.findElement(By.linkText("Log in"));

		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");


		// WebElement UserName = driver.findElement(By.name("user_login"));
		// WebElement Password = driver.findElement(By.id("password"));
		// WebElement LoginButton = driver.findElement(By.name("btn_login"));
		// WebElement RememberMe = driver.findElement(By.className("rememberMe"));

		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter UserName", "Name Entered successfully");
		
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Password", "Password Entered successfully");


		RememberMe.click();
		test.log(LogStatus.PASS, "Click on RememberMe", "RememberMe clicked successfully");


		LoginButton.click();
		test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");



	}

	/*
	 * public void UICheck() {
	 * 
	 * Assert.assertTrue(UserName.isDisplayed());
	 * 
	 * }
	 */

}
