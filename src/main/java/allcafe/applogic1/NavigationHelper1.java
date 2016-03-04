package allcafe.applogic1;

import static org.testng.AssertJUnit.assertTrue;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import allcafe.applogic.NavigationHelper;
import allcafe.model.Link;
import allcafe.model.Page;

public class NavigationHelper1<InternalPage> extends DriverBasedHelper implements NavigationHelper {
	
	 private String baseUrl;
	
	 public NavigationHelper1(ApplicationManager1 manager) {
	    super(manager.getWebDriver());
	    this.baseUrl = manager.getBaseUrl();
	 }
	 
	 @Override
	 public void openMainPage() {
	    driver.get(baseUrl);
	 }
	 
	 @Override
	 public void openRelativeUrl(String url) {
	    driver.get(baseUrl + url);
	 }

	 @Override
	 public void gotoLoginPage() {
		 driver.findElement(By.cssSelector(".user-block a[href='http://allcafe.ru/community/in']")).click();
	 }
	 
	 @Override
	 public void gotoRestaurantsCatalog() {
		 openLinkFromDropDownMenu(Link.RESTAURANTS_CATALOG, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoReviews() {
		 openLinkFromDropDownMenu(Link.REVIEWS, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoJournal() {
		 openLinkFromDropDownMenu(Link.JOURNAL, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoRatings() {
		 openLinkFromDropDownMenu(Link.RATINGS, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoDiscounts() {
		 openLinkFromDropDownMenu(Link.DISCOUNTS, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoDelivery() {
		 openLinkFromDropDownMenu(Link.DELIVERY, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoDomainMainPage() {
		 pages.internalPage.clickLogo().ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoPoster() {
		 openLinkFromDropDownMenu(Link.POSTER, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoAddRestaurant() {
		 openLinkFromDropDownMenu(Link.ADD_RESTARAUNT, Link.RESTAURANTS);
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void gotoTop() {
		 driver.findElement(By.cssSelector(Link.TOP.getSelector()));
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 @Override
	 public void townSelect(String name) {
		 pages.internalPage.clickTownSelect();
		 String town = ".city-selector ul li[data-title='" + name + "']";
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(town)));
		 driver.findElement(By.cssSelector(town)).click();
		 pages.internalPage.ensurePageLoaded();
	 }
	 
	 public boolean isTownSelect(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".city-selector a")));
		String townName = driver.findElement(By.cssSelector(".city-selector a")).getText();
		System.out.println(townName);
		System.out.println(name);
		assertEquals(townName, name);
		if (townName.equals(name)) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
		
	}
	 
	 public void openLinkFromDropDownMenu(Link link, Link dropdownLink) {
		Actions builder = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(dropdownLink.getSelector())));
		WebElement dropdownLinkElement = driver.findElement(By.cssSelector(dropdownLink.getSelector()));
		builder.moveToElement(dropdownLinkElement).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(link.getSelector())));
		if(driver.findElements(By.cssSelector(link.getSelector())).size() == 0) {
			builder.moveToElement(dropdownLinkElement).perform();
		}
		driver.findElement(By.cssSelector(link.getSelector())).click();
	  } 
	 
	 public boolean isRestaurantCatalogLoaded() {
		 if (driver.findElements(By.cssSelector(".restaurants .item .img-container")).size() > 0) {
			 System.out.println("Рестораны есть");
			 return true;
		 }
		 else if(driver.findElements(By.cssSelector(".restaurants .item .img-container")).size() == 0 
					&& (driver.findElement(By.cssSelector(".restaurants .item")).getText() 
							== "По вашему запросу ничего не найдено :(")) {
					 System.out.println("Нет ресторанов");
					 return true;
	     }
		 else {
			 return false;
		 }
	 }
	 
	 public boolean isReviewsLoaded() {
		 if (driver.findElements(By.cssSelector(".reviews-block")).size() > 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public boolean isPosterLoaded() {
		 if (driver.findElements(By.cssSelector(".reviews-block")).size() > 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
}
