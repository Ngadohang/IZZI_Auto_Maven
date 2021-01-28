package pageObjectIZZI;

import org.openqa.selenium.WebDriver;

import PageUI_User.ProfilePageIUI;
import common.AbstractPageOne;
import common.AbstractPageUploadFiles;

public class ProfilePageObject extends AbstractPageOne {
	WebDriver driver;

	public ProfilePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getCurrentDomain() {
		return getCurrentPageUrl(driver);
	}

	public boolean isInfoProfileDisplayed(String... values) {
		return isElementDisplay(driver, ProfilePageIUI.INFO_PROFILE, values);
	}

	public void clickToEditProfileInfoButton() {
		waitToElementClickable(driver, ProfilePageIUI.EDIT_BUTTON);
		clickToElement(driver, ProfilePageIUI.EDIT_BUTTON);
	}

	public boolean isImageProfileDisplayed(String image) {
		return upload.areFileUploadDisplay(driver, ProfilePageIUI.IMAGE_UPLOADED, image);
		
	}

	public boolean isImageProfileLoaded() {
		return isImageLoaded(driver, ProfilePageIUI.IMAGE_UPLOADED);
	}

	AbstractPageUploadFiles upload;

}
