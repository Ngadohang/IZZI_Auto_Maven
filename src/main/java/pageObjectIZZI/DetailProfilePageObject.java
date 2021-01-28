package pageObjectIZZI;

import org.openqa.selenium.WebDriver;

import PageUI_User.HomePageUI;
import PageUI_User.ProfilePageIUI;
import common.AbstractPageOne;
import common.AbstractPageUploadFiles;

public class DetailProfilePageObject extends AbstractPageOne {
	WebDriver driver;

	public DetailProfilePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getFirstNameTextBox() {
		waitForElementVisible(driver, ProfilePageIUI.FIRST_NAME_TEXTBOX);
		return getTextAttribute(driver, ProfilePageIUI.FIRST_NAME_TEXTBOX,"value");
	}

	public String getEmailTextBox() {
		waitForElementVisible(driver, ProfilePageIUI.EMAIL_TEXTBOX);
		return getTextAttribute(driver, ProfilePageIUI.EMAIL_TEXTBOX,"value");
	}

	public String getMobileTextBox() {
		waitForElementVisible(driver, ProfilePageIUI.MOBLIE_TEXTBOX);
		return getTextAttribute(driver, ProfilePageIUI.MOBLIE_TEXTBOX,"value");
	}

	public String getAccoutEmail() {
		waitForElementVisible(driver, ProfilePageIUI.ACCOUNT_EMAIL_TEXTBOX);
		return getTextAttribute(driver, ProfilePageIUI.ACCOUNT_EMAIL_TEXTBOX,"value");
	}

	public String getAccountName() {
		waitForElementVisible(driver, ProfilePageIUI.ACCOUNT_TEXTBOX);
		return getTextAttribute(driver, ProfilePageIUI.ACCOUNT_TEXTBOX,"value");
	}

	public boolean isEmailChecked() {
		return isElementSelected(driver, ProfilePageIUI.SMS_CHECKBOX);
	}

	public String getTimeZoneSelected() {
		waitForElementVisible(driver, ProfilePageIUI.TIMEZONE_SELECTION);
		return getFirstSelectedTextInDropdownDefault(driver, ProfilePageIUI.TIMEZONE_SELECTION);
	}

	public boolean isEmailProfileDisable() {
		return isElementEnable(driver, ProfilePageIUI.EMAIL_TEXTBOX);
	}

	public boolean isEmailAccountDisable() {
		return isElementEnable(driver, ProfilePageIUI.ACCOUNT_EMAIL_TEXTBOX);
	}

	public boolean isAccountDisable() {
		return isElementEnable(driver, ProfilePageIUI.ACCOUNT_TEXTBOX);
	}

	public void inputToFirstName(String editFirstName) {
		waitForElementVisible(driver, ProfilePageIUI.FIRST_NAME_TEXTBOX);
		senkeyToElement(driver, ProfilePageIUI.FIRST_NAME_TEXTBOX, editFirstName);

	}

	public void inputToLastName(String editLastName) {
		waitForElementVisible(driver, ProfilePageIUI.LAST_NAME_TEXTBOX);
		senkeyToElement(driver, ProfilePageIUI.LAST_NAME_TEXTBOX, editLastName);

	}

	public void inputToPhone(String editPhone) {
		waitForElementVisible(driver, ProfilePageIUI.MOBLIE_TEXTBOX);
		senkeyToElement(driver, ProfilePageIUI.MOBLIE_TEXTBOX, editPhone);
	}

	public void inputToCompanyName(String editCompanyName) {
		waitForElementVisible(driver, ProfilePageIUI.COMPANY_TEXTBOX);
		senkeyToElement(driver, ProfilePageIUI.COMPANY_TEXTBOX, editCompanyName);
	}

	public void inputToCompanySite(String editCompanySize) {
		waitForElementVisible(driver, ProfilePageIUI.SITE_COMPANY_TEXTBOX);
		senkeyToElement(driver, ProfilePageIUI.SITE_COMPANY_TEXTBOX, editCompanySize);
	}

	public void inputToDateBirth(String dateBirth) {
		waitForElementVisible(driver, ProfilePageIUI.DATE_TEXTBOX);
		senkeyToElement(driver, ProfilePageIUI.DATE_TEXTBOX, dateBirth);
	}

	public void clickToProfileSaveButton() {
		waitToElementClickable(driver, ProfilePageIUI.INFO_SAVE_BUTTON);
		clickToElement(driver, ProfilePageIUI.INFO_SAVE_BUTTON);
	}

	public boolean isEditSuccessMessageDisplayed() {
		return isElementDisplay(driver, ProfilePageIUI.EDIT_SUCCESS);
	}

	public void selectToTimeZone(String newTimeZone) {
		selectItemInDropdownDefault(driver, ProfilePageIUI.TIMEZONE_SELECTION, newTimeZone);
	}

	public void clickToSMSCheckBox() {
		waitToElementClickable(driver, ProfilePageIUI.SMS_CHECKBOX);
		clickToElement(driver, ProfilePageIUI.SMS_CHECKBOX);
	}

	public void clickToAccoutSaveButton() {
		waitToElementClickable(driver, ProfilePageIUI.ACCOUNT_SAVE_BUTTON);
		clickToElement(driver, ProfilePageIUI.ACCOUNT_SAVE_BUTTON);
	}

	public boolean isImageProfileDisplayed(String image) {
		return upload.areFileUploadDisplay(driver, ProfilePageIUI.PROFILE_IMAGE, image);
	}

	public void clickToImageSaveButton() {
		waitToElementClickable(driver, ProfilePageIUI.IMAGE_SAVE);
		clickToElement(driver, ProfilePageIUI.IMAGE_SAVE);
	}

	public String getCompanyNameTextBox() {
		waitForElementVisible(driver, ProfilePageIUI.COMPANY_TEXTBOX);
		return getTextElement(driver, ProfilePageIUI.COMPANY_TEXTBOX);
	}

	public String getCompanySiteTextBox() {
		waitForElementVisible(driver, ProfilePageIUI.SITE_COMPANY_TEXTBOX);
		return getTextElement(driver, ProfilePageIUI.SITE_COMPANY_TEXTBOX);
	}

	public String getDateBirthTextBox() {
		waitForElementVisible(driver, ProfilePageIUI.DATE_TEXTBOX);
		return getTextElement(driver, ProfilePageIUI.DATE_TEXTBOX);
	}

	public boolean isSMSChecked() {
		return isElementSelected(driver, ProfilePageIUI.SMS_CHECKBOX);
	}

	public boolean isImageProfileLoaded() {
		return isImageLoaded(driver, ProfilePageIUI.IMAGE_UPLOADED);
	}

	public boolean isTilteProfilePageDisplayed() {
		return isElementDisplay(driver, ProfilePageIUI.TITLE_PROFILE);
	}

	public void clickToProfileIcon() {
		waitToElementClickable(driver, HomePageUI.ICON_PROFILE);
		clickToElement(driver, HomePageUI.ICON_PROFILE);
	}
	public void clickToProfileLink() {
		waitToElementClickable(driver, HomePageUI.PROFILE_LINK);
		clickToElement(driver, HomePageUI.PROFILE_LINK);
	}

	public void clickToOkButton() {
		waitToElementClickable(driver, ProfilePageIUI.OK_BUTTON);
		clickToElement(driver, ProfilePageIUI.OK_BUTTON);
	}
	AbstractPageUploadFiles upload;

}
