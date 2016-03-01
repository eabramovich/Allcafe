package allcafe.selenium;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void printText(String textBoxSelector, String text) {
		WebElement textBox = driver.findElement(By.cssSelector(textBoxSelector));
		textBox.clear();
		textBox.sendKeys(text);
	}
	
	public void click(String elementSelector) {
		WebElement element = driver.findElement(By.cssSelector(elementSelector));
		element.click();
	}

}
