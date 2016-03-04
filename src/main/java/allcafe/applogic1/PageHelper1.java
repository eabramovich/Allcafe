package allcafe.applogic1;

import org.openqa.selenium.By;

import allcafe.applogic.PageHelper;
import allcafe.model.Page;

	
public class PageHelper1<InternalPage> extends DriverBasedHelper implements PageHelper {
	
	 private String baseUrl;
	 
	 public PageHelper1(ApplicationManager1 manager) {
	    super(manager.getWebDriver());
	    this.baseUrl = manager.getBaseUrl();
	 }
	 
	 public boolean isPageLoaded(String selectorElement) {
		 if (driver.findElements(By.cssSelector(selectorElement)).size() > 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
}

