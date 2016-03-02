package allcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class InternalPage extends AnyPage {

	public InternalPage(PageManager pages) {
		super(pages);
	}
	
	public InternalPage ensurePageLoaded() {
	    super.ensurePageLoaded();
	    wait.until(presenceOfElementLocated(By.cssSelector("nav")));
	    return this;
	}
	
	public boolean afterLogoutPageLoaded() {
		try {
			wait.until(presenceOfElementLocated(By.cssSelector(".user-block a[href='http://allcafe.ru/community/in']")));
			return true;
		} catch (TimeoutException to) {
			return false;
		}
	}
	
	public boolean afterLoginPageLoaded() {
		try {
			wait.until(presenceOfElementLocated(By.cssSelector(".info a.exit")));
			return true;
		} catch (TimeoutException to) {
			return false;
		}
	}
	
	@FindBy(css = "a.exit")
	private WebElement logoutLink;
	
	@FindBy(css = ".info .name")
	private WebElement username;
	
	public InternalPage clickLogoutLink() {
		logoutLink.click();
		return this;
	}
	
	public String getLoggedUsername() {
		return username.getText();
	}

}
