package allcafe.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class TestMainMenu extends TestBase {
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	
	  @Test
	  public void checkMenu() throws Exception {
		
		driver.get(baseUrl);
		HomePage homePage = new HomePage(baseUrl, driver);
		
		homePage.open();
		
		homePage.openFromDropDownMenu(Link.RESTAURANTS_CATALOG, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.RESTAURANTS.getTitle());
		homePage.goBack();
		
		homePage.openFromDropDownMenu(Link.REVIEWS, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.REVIEWS.getTitle());
		homePage.goBack();
		
		homePage.openFromDropDownMenu(Link.POSTER, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.POSTER.getTitle());
		homePage.goBack();
		
		homePage.openFromDropDownMenu(Link.JOURNAL, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.JOURNAL.getTitle());
		homePage.goBack();
		
		homePage.openFromDropDownMenu(Link.RATINGS, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.RATINGS.getTitle());
		
		homePage.openFromDropDownMenu(Link.DISCOUNTS, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.DISCOUNTS.getTitle());
		
		homePage.openFromDropDownMenu(Link.DELIVERY, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.DELIVERY.getTitle());
		
		homePage.openFromDropDownMenu(Link.ADD_RESTARAUNT, Link.RESTAURANTS);
		assertEquals(driver.getTitle(), Page.ADD_RESTARAUNT.getTitle());
		
		homePage.openLink(Link.TOP);
		assertEquals(driver.getTitle(), Page.TOP.getTitle());
		
		homePage.openLink(Link.BANKET_OFFERS);
		assertEquals(driver.getTitle(), Page.BANKET_OFFERS.getTitle());
		
		homePage.openFromDropDownMenu(Link.CORPORATE, Link.BANKET_OFFERS);
		assertEquals(driver.getTitle(), Page.CORPORATE.getTitle());
		
		homePage.openFromDropDownMenu(Link.BANKETS, Link.BANKET_OFFERS);
		assertEquals(driver.getTitle(), Page.BANKETS.getTitle());
		
		homePage.openFromDropDownMenu(Link.BANKETS, Link.BANKET_OFFERS);
		assertEquals(driver.getTitle(), Page.BANKETS.getTitle());
		
		homePage.openFromDropDownMenu(Link.WEDDING, Link.BANKET_OFFERS);
		assertEquals(driver.getTitle(), Page.WEDDING.getTitle());
		
		homePage.openFromDropDownMenu(Link.CHILD_CELEBRATION, Link.BANKET_OFFERS);
		assertEquals(driver.getTitle(), Page.CHILD_CELEBRATION.getTitle());
		
		homePage.openFromDropDownMenu(Link.CATERING, Link.BANKET_OFFERS);
		assertEquals(driver.getTitle(), Page.CATERING.getTitle());
		
		homePage.openLink(Link.NEWS_REVIEWS);
		assertEquals(driver.getTitle(), Page.NEWS_REVIEWS.getTitle());
		
		homePage.openFromDropDownMenu(Link.OPENNING, Link.NEWS_REVIEWS);
		assertEquals(driver.getTitle(), Page.OPENNING.getTitle());
		
		homePage.openFromDropDownMenu(Link.RESTARAUNT_CRITIC, Link.NEWS_REVIEWS);
		assertEquals(driver.getTitle(), Page.RESTARAUNT_CRITIC.getTitle());
		
		homePage.openFromDropDownMenu(Link.INTERVIEWS, Link.NEWS_REVIEWS);
		assertEquals(driver.getTitle(), Page.INTERVIEWS.getTitle());
		homePage.goBack();
		
		homePage.openFromDropDownMenu(Link.AUTHOR_COLUMN, Link.NEWS_REVIEWS);
		assertEquals(driver.getTitle(), Page.AUTHOR_COLUMN.getTitle());
		
		homePage.openFromDropDownMenu(Link.ALL_NEWS, Link.NEWS_REVIEWS);
		assertEquals(driver.getTitle(), Page.ALL_NEWS.getTitle());
		
		homePage.openFromDropDownMenu(Link.EXCURSIONS, Link.NEWS_REVIEWS);
		assertEquals(driver.getTitle(), Page.EXCURSIONS.getTitle());
		
		driver.close();
	  }

}
