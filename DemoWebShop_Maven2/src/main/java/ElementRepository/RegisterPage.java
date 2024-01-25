package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(id="gender-female")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-male")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement LastNameTextField;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;

	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getMaleRadioButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getFemaleRadioButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getFirstNameTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getLastNameTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getPasswordTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getEmailTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getConfirmPasswordTextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getRegisterButton() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
