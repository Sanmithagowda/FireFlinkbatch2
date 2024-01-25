package Assignments;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ElementRepository.RegisterPage;
import GenericLibrary.BaseTest;
import GenericLibrary.CommonUtility;
import GenericLibrary.DataUtility;

public class Register extends BaseTest {

@Test(groups = "Integration", dataProvider = "Register")
public void registerTestCase(String firstname, String lastName,String email, String password, String confirmpassword) {
	//public void register() throws EncryptedDocumentException, IOException {
	
	DataUtility data_utility = new DataUtility();
	CommonUtility common_Utility=new CommonUtility();
	
	String modEmail=common_Utility.getRandomNumber()+email;
	
	//launchTheBrowser();	
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		
		//validating by using hard assert
		org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Register");
		Reporter.log("Demo Web Shop. Register page is displayed");
		
		
		RegisterPage register_page = new RegisterPage(driver);
		register_page.getFemaleRadioButton().click();
		register_page.getFirstNameTextField().sendKeys(firstname);
		register_page.getLastNameTextField().sendKeys(lastName);
		register_page.getEmailTextField().sendKeys(email);

		register_page.getPasswordTextField().sendKeys(password);
		register_page.getConfirmPasswordTextField().sendKeys(confirmpassword);
		register_page.getRegisterButton().click();
		
	}
@DataProvider(name = "Register")
public Object[][] dataSupply() throws EncryptedDocumentException, IOException {
	return DataUtility.getAllDataFromExcel("Sheet1");
}

}
