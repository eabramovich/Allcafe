package allcafe.selenium;

import static org.testng.AssertJUnit.assertTrue;
import static org.junit.Assert.assertEquals;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import allcafe.model.Link;
import allcafe.model.Page;
import allcafe.model.User;

public class MainMenuTest extends TestBase {
	
	@BeforeMethod
	public void mayBeGotoSpb() {
	   app.getNavigationHelper().gotoDomainMainPage();
	   if (app.getNavigationHelper().isTownSelect("Санкт-Петербурга")) {
		   return;
	   } 
	   else {
		   app.getNavigationHelper().townSelect("Санкт-Петербурга");
	   }
	   
	}
	
	 @Test
	 public void testRestaurantCatalog() throws Exception {
		 app.getNavigationHelper().gotoRestaurantsCatalog();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.RESTAURANTS.getTitle());
		 assertTrue(app.getNavigationHelper().isRestaurantCatalogLoaded());
	 }
	 
	 @Test 
	 public void testReviews() throws Exception {
		 app.getNavigationHelper().gotoReviews();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.REVIEWS.getTitle()); 
		 assertTrue(app.getPageHelper().isPageLoaded(Page.REVIEWS.getSelectorElementPage()));
	 }
	 
	 @Test
	 public void testPoster() throws Exception {
		 app.getNavigationHelper().gotoPoster();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.POSTER.getTitle());
		 assertTrue(app.getPageHelper().isPageLoaded(Page.POSTER.getSelectorElementPage()));
	 }
	 
	 @Test
	 public void testJournal() throws Exception {
		 app.getNavigationHelper().gotoJournal();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.JOURNAL.getTitle());
		 assertTrue(app.getPageHelper().isPageLoaded(Page.JOURNAL.getSelectorElementPage()));
	 }
	 
	 @Test
	 public void testRatings() throws Exception {
		 app.getNavigationHelper().gotoRatings();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.RATINGS.getTitle());
		 assertTrue(app.getPageHelper().isPageLoaded(Page.RATINGS.getSelectorElementPage()));
	 }
	 
	 @Test
	 public void testDiscounts() throws Exception {
		 app.getNavigationHelper().gotoDiscounts();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.DISCOUNTS.getTitle());
		 assertTrue(app.getPageHelper().isPageLoaded(Page.DISCOUNTS.getSelectorElementPage()));
	 }
	 
	 @Test
	 public void testDelivery() throws Exception {
		 app.getNavigationHelper().gotoDelivery();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.DELIVERY.getTitle());
		 assertTrue(app.getPageHelper().isPageLoaded(Page.DELIVERY.getSelectorElementPage()));
	 }
	 
	 @Test 
	 void testAddRestaurant() throws Exception {
		 app.getNavigationHelper().gotoAddRestaurant();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.ADD_RESTARAUNT.getTitle());
		 assertTrue(app.getPageHelper().isPageLoaded(Page.ADD_RESTARAUNT.getSelectorElementPage()));
	 }
	 
	 @Test
	 void testTop() throws Exception {
		 app.getNavigationHelper().gotoTop();
		 assertEquals(app.getDriverBasedHelper().getTitlePage(), Page.TOP.getTitle());
		 assertTrue(app.getPageHelper().isPageLoaded(Page.TOP.getSelectorElementPage()));
	 }
	 
	 
}
