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
	if (user.getPassword().equals("wrong")) {
		return;
	}
    this.user = user;
  }

  @Override
  public void logout() {
    this.user = null;
  }

  @Override
  public boolean isLoggedIn() {
    return user != null;
  }

  @Override
  public boolean isLoggedInAs(User user) {
    return isLoggedIn() && this.user.getLogin().equals(user.getLogin());
  }

  @Override
  public boolean isNotLoggedIn() {
    return user == null;
  }

  @Override
  public void createUser(User user) {
	// TODO Auto-generated method stub
	  this.user = user;
  }

}