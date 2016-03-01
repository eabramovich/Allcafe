package allcafe.selenium;

import org.openqa.selenium.WebDriver;
import allcafeTest.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;

import static org.junit.Assert.assertEquals;


public class LoginPage extends AbstractPage {
	
	private String url;
	
	public LoginPage(String url, WebDriver driver) {
		super(driver);
		this.url = url;
	}
	
	public LoginPage open() {
		driver.get(url);
		driver.manage().window().maximize();
		return this;
	}
	
	public void loginAs(User user) {
		printText("input[name='email']", user.getLogin());
		printText("input[name='password']", user.getPassword());
		click("input[name='submit']");
	}
}
