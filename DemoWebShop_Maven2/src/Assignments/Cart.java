package Assignments;


	import java.io.IOException;
	import java.time.Duration;
	import java.util.List;

	import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.pqc.jcajce.provider.lms.LMSSignatureSpi.generic;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	import GenericLibrary.BaseTest;

	@Listeners(GenericLibrary.ListenersImplementation.class)
	public class Cart extends BaseTest {
		@Test (groups = "System")
		public void addtocart() throws InterruptedException, EncryptedDocumentException, IOException {
		//LaunchBrowser();
		//login();
	

			//validating by using hard assert
		org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop ");
		Reporter.log("Demo Web Shop Page Displayed");
		
			
			
			driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();

			
			
			//validating by using hard assert
		org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Digital downloads");
		Reporter.log("Demo Web Shop Digital downloads page is displayed");
		
			
			
			
			Thread.sleep(2000);
			List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"center-2\"]//div/div/div/div[3]/div[2]/input"));
			Thread.sleep(2000);
			for (WebElement webElement : all) {
				webElement.click();
				Thread.sleep(2000);
			}
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();


			//validating by using hard assert
		org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart");
		Reporter.log("Demo Web Shop Shopping Cart page is displayed");
		
				 driver.findElement(By.xpath("//div[@class='center-1']/div/div[2]/div/form/table//td//input[1]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//div[@class='center-1']/div/div[2]/div/form/table//td//input)[3]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//div[@class='center-1']/div/div[2]/div/form/table//td//input)[5]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.name("updatecart")).click();
				 logout();
				 driver.close();
			
				
	}
		}
		

