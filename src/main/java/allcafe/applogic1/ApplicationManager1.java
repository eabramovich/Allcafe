package allcafe.applogic1;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import allcafe.applogic.ApplicationManager;
import allcafe.applogic.NavigationHelper;
import allcafe.applogic.PageHelper;
import allcafe.applogic.UserHelper;

import allcafe.util.PropertyLoader;
import ru.stqa.selenium.factory.WebDriverFactory;

public class ApplicationManager1 implements ApplicationManager {
	
	private UserHelper userHelper;
	private NavigationHelper navHelper;
	private DriverBasedHelper driverBasedHelper;
	private PageHelper pageHelper;
	
	private WebDriver driver;
	private String baseUrl;
	private String gridHubUrl;
	
	public ApplicationManager1() {
		baseUrl = PropertyLoader.loadProperty("site.url");
		gridHubUrl = PropertyLoader.loadProperty("grid2.hub");
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(PropertyLoader.loadProperty("browser.name"));
		capabilities.setVersion(PropertyLoader.loadProperty("browser.version"));
		String platform = PropertyLoader.loadProperty("browser.platform");
		if (!(null == platform || "".equals(platform))) {
			capabilities.setPlatform(Platform.valueOf(PropertyLoader.loadProperty("browser.platform")));
		}
	
		if (!(null == gridHubUrl || "".equals(gridHubUrl))) {
			driver = WebDriverFactory.getDriver(gridHubUrl, capabilities);
		} else {
			driver = WebDriverFactory.getDriver(capabilities);
		}
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 userHelper = new UserHelper1(this);
		 navHelper = new NavigationHelper1(this);
		 driverBasedHelper = new DriverBasedHelper(driver);
		 pageHelper = new PageHelper1(this);

		 getNavigationHelper().openMainPage();
	}


	@Override
	public UserHelper getUserHelper() {
	  return userHelper;
	}

	@Override
	public NavigationHelper getNavigationHelper() {
	  return navHelper;
	}
	
	@Override
	public DriverBasedHelper getDriverBasedHelper() {
		return driverBasedHelper;
	}
	
	@Override
	public PageHelper getPageHelper() {
		return pageHelper;
	}

	protected WebDriver getWebDriver() {
	    return driver;
	}

	protected String getBaseUrl() {
	    return baseUrl;
	}


	@Override
	public void stop() {
		if (driver != null) {
			driver.quit();
		}
	}

}
