package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getEmailTextField() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public WebElement getPasswordTextField() {
		return null;
	}
	
	public WebElement getLoginButton() {
		return null;
	}
	
	
}
