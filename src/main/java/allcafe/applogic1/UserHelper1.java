package allcafe.applogic1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import allcafe.applogic.UserHelper;
import allcafe.model.User;
import allcafe.applogic1.ApplicationManager1;

public class UserHelper1 extends DriverBasedHelper implements UserHelper {

  private ApplicationManager1 manager;
  private User user;

  public UserHelper1(ApplicationManager1 manager) {
	  super(manager.getWebDriver());
  }

  @Override
  public void loginAs(User user) {
	  pages.loginPage.ensurePageLoaded()
      	.setUsernameField(user.getLogin())
      	.setPasswordField(user.getPassword())
      	.clickSubmitButton();
  }

  @Override
  public void logout() {
	  pages.internalPage.ensurePageLoaded()
      .clickLogoutLink();
  }

  @Override
  public boolean isLoggedIn() {
	  return pages.internalPage.afterLoginPageLoaded();
  }

  @Override
  public boolean isLoggedInAs(User user) {
    return isLoggedIn() && pages.internalPage.ensurePageLoaded().getLoggedUsername().equals(user.getLogin());
  }
  
  @Override
  public boolean isNotLoggedIn() {
	  return pages.internalPage.afterLogoutPageLoaded();
  }
  
  @Override
  public boolean isWrongPasswordOrLogin() {
	  return pages.loginPage.waitPageLoaded()
		&& pages.loginPage.getTextError().equals("Неправильный e-mail/логин/пароль");
  }
  
  /*@Override
  public boolean isNotLoggedIn() {
	  return pages.internalPage.afterLogoutPageLoaded();
  }*/
 
}