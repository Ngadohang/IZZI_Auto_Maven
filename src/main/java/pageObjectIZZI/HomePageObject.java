package pageObjectIZZI;

import org.openqa.selenium.WebDriver;

import PageUI_User.HomePageUI;
import common.AbstractPageOne;

public class HomePageObject extends AbstractPageOne {
	WebDriver driver;
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
	}
	public void clickToProfileIcon() {
		waitToElementClickable(driver, HomePageUI.ICON_PROFILE);
		clickToElement(driver, HomePageUI.ICON_PROFILE);
	}
	public void clickToProfileLink() {
		waitToElementClickable(driver, HomePageUI.PROFILE_LINK);
		clickToElement(driver, HomePageUI.PROFILE_LINK);
	}
	
}
