package pageObjectIZZI;

import org.openqa.selenium.WebDriver;

import PageUI_User.LoginPageUI;
import common.AbstractPageOne;

public class LoginPageObject extends AbstractPageOne {
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}

	public WebDriver driver;
	
	public boolean isTitleLoginPageDisplayed() {
		return isElementDisplay(driver, LoginPageUI.TITLE_LOGIN_PAGE);
	}

	public void inputToEmailTextBox(String email) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}

	public void inputToPasswordTextBox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public void clickToLoginButton() {
		waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

	public void clickToRegisterLink() {
		waitToElementClickable(driver, LoginPageUI.REGISTER_LINK);
		clickToElement(driver, LoginPageUI.REGISTER_LINK);
	}

	public boolean isChatBoxDisplayed() {
		waitForElementVisible(driver, LoginPageUI.IFRAME);
		switchToFrame(driver, LoginPageUI.IFRAME);
		return isElementDisplay(driver, LoginPageUI.CHAT_BOX);
	}

	public void clickToCloseChatBox() {
		waitToElementClickable(driver, LoginPageUI.CHAT_BOX_CLOSE);
		clickToElement(driver, LoginPageUI.CHAT_BOX_CLOSE);
		switchFrame(driver);
	}

	public Long getMilisecondLoadPage(String url) {
		return getMilisecondLoadPage(driver, url);
	}

	public boolean isLoginFailMessageDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void refeshPage() {
		// TODO Auto-generated method stub
		
	}

	public boolean isLoginSuccessMessageDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void clickToRecoveryPassword() {
		// TODO Auto-generated method stub
		
	}

	public void goToLoginPage(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
