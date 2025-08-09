package testcase;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;

@Test
public class AddItemToCart extends TestBase {
	public void addItemToCart() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.xpath(or.getProperty("search_xpath")));
		search.click();
		search.sendKeys("Refrigerator");
		search.sendKeys(Keys.ENTER);
		List<WebElement> customer_review = driver.findElements(By.xpath(or.getProperty("customer_review_xpath")));
		for (WebElement review : customer_review) {

			WebElement choosen_review = review.findElement(By.xpath(or.getProperty("review_xpath")));
			choosen_review.click();
		}
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Store the window handle of the first window
		String mainPage = driver.getWindowHandle();
		System.out.println("main page" + mainPage);

		//choose brand
		
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		WebElement choose_brand=driver.findElement(By.xpath(or.getProperty("brand")));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choose_brand);

		    
		    Thread.sleep(2000); 

		    choose_brand.click();
		
		
		
		    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10)); 

		    
		WebElement choose_refrigerator=driver.findElement(By.xpath(or.getProperty("refrigerator")));
		   
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choose_refrigerator);

		    
		    Thread.sleep(2000); 

		    choose_refrigerator.click();
		
		
		Set<String> allpages = driver.getWindowHandles();
		for (String page : allpages) {
			if (!page.equals(mainPage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());

		//To add in cart
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement cart=driver.findElement(By.xpath(or.getProperty("add_to_cart")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cart);
		cart.click();

	}
}
