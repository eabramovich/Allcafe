package webportfolio;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import allcafeTest.LoginPage;

public class LoginUser {
	private WebDriver driver;
	private String baseUrl = "http://allcafe.ru/community/in";
	private LoginPage loginPage;
	private String loginSelector =  ".logged-block .info span";
	
	@Before
	public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  loginPage = new LoginPage(baseUrl, driver);
	  loginPage.open();
	}
	
	@Test
	  public void adminLogin() throws Exception {
		loginPage.loginAs(User.ADMIN);
		assertUserLogin(User.ADMIN);
	  }
	
	@Test
	public void userLogin() {
		loginPage.loginAs(User.SEO);
		assertUserLogin(User.SEO);
	}
	
	public void assertUserLogin(User user) {
		String login = driver.findElement(By.cssSelector(loginSelector)).getText();
		assertEquals(login , user.getLogin());
	}
	
	@After
	public void setDown() {
		driver.close();
		
	}

}
