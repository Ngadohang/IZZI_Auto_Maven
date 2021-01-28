package pageObjectIZZI;

import org.openqa.selenium.WebDriver;

import PageUI_User.RegisterPageUI;
import common.AbstractPage;
import common.AbstractPageOne;

public class RegisterPageObject extends AbstractPageOne {
	WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;

	}

	public boolean isTitleRegisterPageDisplayed() {
		return isElementDisplay(driver, RegisterPageUI.TITLE_REGISTER_PAGE);
	}

	public String inputToNameTextBox(String name) {
		waitForElementVisible(driver, RegisterPageUI.NAME_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.NAME_TEXTBOX, name);
		return name;
	}

	public String inputToPhoneNumberTextBox(String phone) {
		waitForElementVisible(driver, RegisterPageUI.PHONE_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.PHONE_TEXTBOX, phone);
		return phone;
	}

	public void inputToPasswordTextBox(String password) {
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
	}

	public void inputToPasswordComfirmTextBox(String comfirmPassword) {
		waitForElementVisible(driver, RegisterPageUI.COMFIRM_PASSWORD_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.COMFIRM_PASSWORD_TEXTBOX, comfirmPassword);
	}

	public void clickToRegisterButton() {
		waitToElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public void inputToEmailTextBox(String email) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
	}

}
