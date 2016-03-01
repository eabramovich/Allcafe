package allcafe.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestSearchByDistrict extends TestBase {
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	
	  @Test
	  public void checkSearchDistrict() throws Exception {
		
	  	HomePage homePage = new HomePage(baseUrl, driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement district;
		String nameLocation;
		String nameLocationFilter;
		
		homePage.open();
		
		String[] districtSelector = new String[36];
		
		for (int i = 0; i < districtSelector.length; i++) {
			districtSelector[i] = ".wm_area input[id='" + i + "']";
			System.out.println(districtSelector[i]);
		}
		
		for (int i = 0; i < districtSelector.length; i++) {
			district = driver.findElement(By.cssSelector(SearchParams.DISTRICT.getSelector()));
			System.out.println(district);
			wait.until(ExpectedConditions.elementToBeClickable(district));
			district.click();
			if(driver.findElements(By.cssSelector(".fancybox-wrap") ).size() == 0) {
				district.click();
			}
			
			System.out.println(districtSelector[i]);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(districtSelector[i])));
			WebElement district_location = driver.findElement(By.cssSelector(districtSelector[i]));
			//wait.until(ExpectedConditions.visibilityOf(district_location));
			nameLocation =  district_location.getAttribute("value");
			district_location.click();
			driver.findElement(By.cssSelector(".fancybox-inner .search-btn")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#filters")));
			nameLocationFilter = driver.findElement(By.cssSelector("#filters span")).getText();
			System.out.println(nameLocationFilter);
			System.out.println(nameLocation);
			assertEquals(nameLocationFilter, nameLocation);
			if(driver.findElements(By.cssSelector(".restaurants .item .img-container")).size() == 0) {
				String bodyText = driver.findElement(By.cssSelector(".restaurants .item")).getText();
				Assert.assertEquals("По вашему запросу ничего не найдено :(", bodyText);
				System.out.println(nameLocation + " нет ресторанов");
			}
			else {
				System.out.println(nameLocation + " рестораны есть");
			}
			driver.findElement(By.cssSelector("#filters ins")).click();
			wait.until(ExpectedConditions.titleIs("Все рестораны Санкт-Петербурга: расположение на карте, отзывы, рейтинг ресторанов СПб"));
		}
		driver.close();
	  }

}
