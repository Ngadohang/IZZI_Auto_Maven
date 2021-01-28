package common;

import org.openqa.selenium.WebDriver;

import pageObjectIZZI.ChangePasswordPageObject;
import pageObjectIZZI.DetailProfilePageObject;
import pageObjectIZZI.GmailPageObject;
import pageObjectIZZI.HomePageObject;
import pageObjectIZZI.LoginPageObject;
import pageObjectIZZI.ProfilePageObject;
import pageObjectIZZI.RecoveryPasswordPageObject;
import pageObjectIZZI.RegisterPageObject;

public class PageManagerPageObject {
	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}
	
	public static DetailProfilePageObject getDetailProfilePage(WebDriver driver) {
		return new DetailProfilePageObject(driver);
	}
	
	public static ProfilePageObject getProfilePageObject(WebDriver driver) {
		return new ProfilePageObject(driver);
	}
	public static ChangePasswordPageObject getChangePasswordPageObject(WebDriver driver) {
		return new ChangePasswordPageObject(driver);
	}
	public static RecoveryPasswordPageObject getRecoveryPasswordPageObject(WebDriver driver) {
		return new RecoveryPasswordPageObject(driver);
	}
	public static GmailPageObject getGmailPageObject(WebDriver driver) {
		return new GmailPageObject(driver);
	}

}
