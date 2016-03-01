package allcafe.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSearchByUnderground extends TestBase {
	
	@Test
	public void checkSearchByUnderground() throws Exception {
		HomePage homePage = new HomePage(baseUrl, driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement underground;
		
		homePage.open();
		
		String[] undergroundSelector = new String[65];
		
		for (int i = 0; i < undergroundSelector.length; i++) {
			undergroundSelector[i] = ".wm_area label[data-id='" + i + "']";
			System.out.println(undergroundSelector[i]);
		}
		
		for (int i = 0; i < undergroundSelector.length; i++) {
			underground = driver.findElement(By.cssSelector(SearchParams.UNDERGROUND.getSelector()));
			underground.click();
			
			if(driver.findElements(By.cssSelector(".fancybox-wrap") ).size() == 0) {
				underground.click();
			}
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(undergroundSelector[i])));
			WebElement metroStation = driver.findElement(By.cssSelector(undergroundSelector[i]));
			String nameStation = metroStation.getAttribute("value");
			
			//metroStation.click();
			driver.findElement(By.cssSelector(".fancybox-inner .search-btn")).click();
			
			String nameUndergroundFilter = driver.findElement(By.cssSelector("#filters span")).getText();
			System.out.println(nameStation);
			System.out.println(nameUndergroundFilter);
		}
	}

}
