package allcafe.selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import allcafe.applogic.ApplicationManager;
import allcafe.applogic1.ApplicationManager1;
import allcafe.applogic1.DriverBasedHelper;
import allcafe.model.User;

public class TestBase {

	protected ApplicationManager app;

	@BeforeClass
	public void init() {
		app = new ApplicationManager1();
	}
	
	@AfterSuite
	public void stop() {
	  app.stop();
	}
	
}