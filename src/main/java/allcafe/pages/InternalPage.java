package allcafe.pages;

import org.openqa.selenium.By;
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
	
	@FindBy(css = "nav a[href $= '?logout']")
	private WebElement logoutLink;

}
