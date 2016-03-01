package allcafe.applogic1;

import allcafe.applogic.NavigationHelper;

public class NavigationHelper1 extends DriverBasedHelper implements NavigationHelper {
	
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
}
