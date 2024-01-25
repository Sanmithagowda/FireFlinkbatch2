package Assignments;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;

public class Order extends BaseTest {
		   
             @Test
			public void Order() throws InterruptedException  {
			//launchTheBrowser();
			//register();

			
			//validating by using hard assert
			org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
       	    Reporter.log("Demo Web Shop page displayed,true");
			
				
			
				driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a")).click();
				Thread.sleep(2000);

				
				//validating by using hard assert
				org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers");
				Reporter.log("Demo Web Shop Computers page is displayed");
				
					
					
				driver.findElement(By.xpath("(//a[@href='/desktops'])[3]")).click();
				Thread.sleep(2000);
			
				
				//validating by using hard assert
				org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Desktops");
				Reporter.log("Demo Web Shop. Desktops page is displayed");
				
					
					
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500);");
				Thread.sleep(4000);
				System.out.println("ppp");
				driver.findElement(By.xpath("//a[text()='Simple Computer']")).click();
				Thread.sleep(4000);
			
				
				//validating by using hard assert
				org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Simple Computer");
				Reporter.log("Demo Web Shop Simple Computer page is displayed");
				
					
				driver.findElement(By.xpath("//input[@name='product_attribute_75_5_31']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("add-to-cart-button-75")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				Thread.sleep(2000);
			}
				
				
				//validating by using hard assert
				org.testng.Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Shopping Cart");
				Reporter.log("Demo Web Shop Shopping Cart page is displayed");
				
					
				driver.findElement(By.xpath("//div[@class='center-1']/div/div[2]/div/form/table//td[1]//input")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("termsofservice")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("checkout")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@class='button-1 checkout-as-guest-button']")).click();
				Thread.sleep(2000);
				
				WebElement trf = driver.findElement(By.id("BillingNewAddress_CountryId"));
				Thread.sleep(2000);
				Select s=new Select(trf);
				Thread.sleep(2000);
				s.selectByValue("41");
				Thread.sleep(2000);
				driver.findElement(By.id("BillingNewAddress_City")).sendKeys("SHIMOGA",Keys.TAB,"1234",Keys.TAB,"3RD cross",Keys.TAB,"572001",Keys.TAB,"123456778");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
				//logout();
				//Close();
				
				
			}

}
