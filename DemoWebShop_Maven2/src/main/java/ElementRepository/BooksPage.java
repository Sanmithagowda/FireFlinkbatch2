package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage {

	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement Fixtionex;
	
	
	@FindBy(id="products-orderby")
	private WebElement sortdropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement displaydropdon;
	
	public BooksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getFixtionex() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public WebElement getsortdropdown() {
		return null;
	}
	
	public WebElement getdisplaydropdon() {
		return null;
	}
	
}
