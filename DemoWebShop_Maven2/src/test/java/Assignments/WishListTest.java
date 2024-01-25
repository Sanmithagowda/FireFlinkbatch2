package Assignments;

	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

	import GenericLibrary.BaseTest;
	import GenericLibrary.DataUtility;


	public class WishListTest extends BaseTest {
		@Test(groups = "System")
		public void wishlist()throws InterruptedException, EncryptedDocumentException, IOException {
		//LaunchBrowser();
		//login();	
			driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]/a[1]")).click();
			Thread.sleep(2000);

			//validating by using hard assert
			org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
			Reporter.log("Demo Web Shop page is displayed");
			
			
			
			WebElement book = driver.findElement(By.xpath("//a[text()='Fiction EX']"));
			
			String product = book.getText();
			book.click();
			
			Thread.sleep(2000);		

			//validating by using hard assert
			org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Fiction EX");
			Reporter.log("Fiction page is displayed");
			
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
			Thread.sleep(2000);

			
			//validating by using hard assert
			org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Wishlist");
			Reporter.log("Wishlist page is displayed");
			
			
			
			WebElement all = driver.findElement(By.xpath("//a[text()='Fiction EX']"));
		
			Thread.sleep(2000);

			
			//validating by using hard assert
			org.testng.Assert.assertEquals(all.getText(),product);
			Reporter.log("Adding book test case is passed");
			
			
			driver.findElement(By.name("removefromcart")).click();
				driver.findElement(By.xpath("//input[@name='updatecart']")).click();		 			
				
				//logout();
				Thread.sleep(2000);
	            driver.close();
			

		}

	}

