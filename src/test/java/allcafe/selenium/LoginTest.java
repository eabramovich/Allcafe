package allcafe.selenium;

import org.testng.AssertJUnit;
import org.testng.annotations.*;
import allcafe.model.User;

public class LoginTest extends TestBase {
	
	 @BeforeMethod
	 public void mayBeLogout() {
		 app.getNavigationHelper().openMainPage();
		 if (app.getUserHelper().isNotLoggedIn()) {
		      return;
	    }
	    app.getUserHelper().logout();
	  }
	 
	 @Test
	 public void testLoginFailed() throws Exception {
		 app.getNavigationHelper().gotoLoginPage();
		 app.getUserHelper().loginAs(User.SEO_WRONG);
		 AssertJUnit.assertTrue(app.getUserHelper().isWrongPasswordOrLogin());
	 }
	 
	 @Test
	 public void testLoginOK() throws Exception {
		app.getNavigationHelper().gotoLoginPage();
	    app.getUserHelper().loginAs(User.SEO);
	    AssertJUnit.assertTrue(app.getUserHelper().isLoggedInAs(User.SEO));
	 }
	 
}
