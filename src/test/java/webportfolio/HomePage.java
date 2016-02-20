package webportfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class HomePage extends AbstractPage {
	
	private String url;
	
	public HomePage(String url, WebDriver driver) {
		super(driver);
		this.url = url;
	}
	
	public HomePage open() {
		driver.get(url);
		driver.manage().window().maximize();
		return this;
	}
	
	/**
	 * Открытие ссылки из выпадающего меню
	 * 
	 * @param link Селектор ссылки на которую нужно перейти
	 * @param dropdownLink Селектор ссылки для события hover
	 */
	public void openFromDropDownMenu(Link link, Link dropdownLink) {
		Actions builder = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(dropdownLink.getSelector())));
		WebElement restaurant = driver.findElement(By.cssSelector(dropdownLink.getSelector()));
		builder.moveToElement(restaurant).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(link.getSelector())));
		
		if(driver.findElements(By.cssSelector(link.getSelector())).size() == 0) {
			builder.moveToElement(restaurant).perform();
		}
		
		WebElement element = driver.findElement(By.cssSelector(link.getSelector()));
		element.click();
	}
	
	public void openLink(Link link) {
		WebElement element = driver.findElement(By.cssSelector(link.getSelector()));
		element.click();
	}
	
	
	public void goBack() {
		WebElement element = driver.findElement(By.cssSelector(Link.LOGO.getSelector()));
		element.click();
	}

}
