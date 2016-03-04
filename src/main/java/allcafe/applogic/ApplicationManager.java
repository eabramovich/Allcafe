package allcafe.applogic;

import allcafe.applogic1.DriverBasedHelper;

public interface ApplicationManager {
	UserHelper getUserHelper();
	NavigationHelper getNavigationHelper();
	DriverBasedHelper getDriverBasedHelper();
	PageHelper getPageHelper();
	void stop();
	
}
