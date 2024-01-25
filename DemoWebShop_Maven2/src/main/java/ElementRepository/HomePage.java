package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement DigitaldownloadsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement BooksLink;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	private WebElement ComputersLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	private WebElement ElectronicsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	private WebElement ApparelandShoesLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	private WebElement GiftCardsLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
	private WebElement JewelryLink;
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getDigitaldownloadsLink() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public WebElement getBooksLink() {
		return null;
	}
	
	public WebElement getComputersLink() {
		return null;
	}
	
	public WebElement getElectronicsLink() {
		return null;
	}
	
	public WebElement getApparelandShoesLink() {
		return null;
	}
	
	public WebElement getGiftCardsLink() {
		return null;
	}
	
	public WebElement getJewelryLink() {
		return null;
	}
	
}
