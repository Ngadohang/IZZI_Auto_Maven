package com.IZZI.User;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.AbstractPageUploadFiles;
import common.AbstractTest;
import common.GlobalConstants;
import common.PageManagerPageObject;
import commonData.DataHelper;
import pageObjectIZZI.ChangePasswordPageObject;
import pageObjectIZZI.DetailProfilePageObject;
import pageObjectIZZI.GmailPageObject;
import pageObjectIZZI.HomePageObject;
import pageObjectIZZI.LoginPageObject;
import pageObjectIZZI.ProfilePageObject;
import pageObjectIZZI.RecoveryPasswordPageObject;
import pageObjectIZZI.RegisterPageObject;

public class HappyCase extends AbstractTest {
	public WebDriver driver;
	String email, password, fullname, phone, newpassword;
	String editFirstName, editLastName, editPhone, editCompanyName, editCompanySize, dateBirth, newTimeZone;
	String image = "image0.jpg";
	DataHelper data;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getDriver(browserName, url);
		loginPage = PageManagerPageObject.getLoginPage(driver);
		data = data.getData();
	}

	@Test
	public void TC_01_Register_Success() {
		log.info("Check time load login page");
		Long timeload = loginPage.getMilisecondLoadPage("https://baa.izzimember.com");
		log.info("check navigate to login page");
		verifyTrue(loginPage.isTitleLoginPageDisplayed());
		System.out.println(timeload);
		log.info("Check chatbox lay is displayed");
		verifyTrue(loginPage.isChatBoxDisplayed());
		loginPage.clickToCloseChatBox();
		loginPage.clickToRegisterLink();
		registerPage = PageManagerPageObject.getRegisterPage(driver);
		log.info("check navigate to register page");
		verifyTrue(registerPage.isTitleRegisterPageDisplayed());
		log.info("Input data to textbox");
		email = getEmail();
		fullname = registerPage.inputToNameTextBox(data.getFullName());
		registerPage.inputToEmailTextBox(email);
		phone = registerPage.inputToPhoneNumberTextBox(getNumberPhone());
		password = getPassword();
		registerPage.inputToPasswordTextBox(password);
		registerPage.inputToPasswordComfirmTextBox(password);
		registerPage.clickToRegisterButton();

	}

	@Test
	public void TC_02_Login_Success() {
		log.info("Check navigate to login page");
		loginPage = PageManagerPageObject.getLoginPage(driver);
		loginPage.inputToEmailTextBox(email);
		loginPage.inputToPasswordTextBox(password);
		loginPage.clickToLoginButton();
//		log.info("Check time login success");
//		Long timeload = loginPage.getMilisecondLoadPage("https://baa.izzimember.com");
//		System.out.println(timeload);

	}

	@Test
	public void TC_03_Create_Edit_Profile() {
		homePage = PageManagerPageObject.getHomePage(driver);
		homePage.clickToProfileIcon();
		homePage.clickToProfileLink();
		log.info("Check navigate to profile page");
		profilePage = PageManagerPageObject.getProfilePageObject(driver);
		verifyEquals(profilePage.getCurrentDomain(), "https://baa.izzimember.com/profile");
		verifyTrue(profilePage.isInfoProfileDisplayed(fullname, email, phone, email));
		profilePage.clickToEditProfileInfoButton();
		log.info("Check navigate to profile edit");
		detailProfilePage = PageManagerPageObject.getDetailProfilePage(driver);
		verifyTrue(detailProfilePage.isTilteProfilePageDisplayed());
		log.info("Check info is displayed");
		verifyEquals(detailProfilePage.getFirstNameTextBox(), fullname);
		verifyEquals(detailProfilePage.getEmailTextBox(), email);
		verifyEquals(detailProfilePage.getMobileTextBox(), phone);
		verifyEquals(detailProfilePage.getAccountName(), email);
		verifyEquals(detailProfilePage.getAccoutEmail(), email);	
		verifyTrue(detailProfilePage.isEmailChecked());
		verifyEquals(detailProfilePage.getTimeZoneSelected(), "(GMT) UTC");
		log.info("Check textbox is disable");
		verifyFalse(detailProfilePage.isEmailProfileDisable());
		verifyFalse(detailProfilePage.isAccountDisable());
		verifyFalse(detailProfilePage.isEmailAccountDisable());
		log.info("edit info profile");
		editFirstName=data.getFirstName();
		detailProfilePage.inputToFirstName(editFirstName);
		editLastName=data.getLastName();
		detailProfilePage.inputToLastName(editLastName);
		editPhone=getNumberPhone();
		detailProfilePage.inputToPhone(editPhone);
		editCompanyName=data.getCompanyName();
		detailProfilePage.inputToCompanyName(editCompanyName);
		editCompanySize="https://izzicms.com/vi-VN";
		detailProfilePage.inputToCompanySite(editCompanySize);
		dateBirth= "01/28/2021";
		detailProfilePage.inputToDateBirth(dateBirth);
		detailProfilePage.clickToProfileSaveButton();
		log.info("Check save profile success");
		verifyTrue(detailProfilePage.isEditSuccessMessageDisplayed());
		detailProfilePage.clickToOkButton();
		newTimeZone="(GMT-11:00) Samoa";
		detailProfilePage.selectToTimeZone(newTimeZone);
		detailProfilePage.clickToSMSCheckBox();
		log.info("Check save account success");
		verifyTrue(detailProfilePage.isEditSuccessMessageDisplayed());
		detailProfilePage.clickToAccoutSaveButton();
		log.info("upload image profile success");
		upload.uploadMutilFiles(driver, GlobalConstants.UPLOAD_LOCATOR, "uploadFile", image);
		verifyTrue(detailProfilePage.isImageProfileDisplayed(image));
		verifyTrue(detailProfilePage.isImageProfileLoaded());
		detailProfilePage.clickToImageSaveButton();
		log.info("Log in again, check info profile");
		loginPage = PageManagerPageObject.getLoginPage(driver);
		loginPage.inputToEmailTextBox(email);
		loginPage.inputToPasswordTextBox(password);
		loginPage.clickToLoginButton();
		homePage = PageManagerPageObject.getHomePage(driver);
		homePage.clickToProfileIcon();
		homePage.clickToProfileLink();
		profilePage = PageManagerPageObject.getProfilePageObject(driver);
		verifyTrue(profilePage.isImageProfileDisplayed(image));
		verifyTrue(profilePage.isImageProfileLoaded());
		verifyTrue(profilePage.isInfoProfileDisplayed(editFirstName + editLastName, email, editPhone, email));
		verifyEquals(detailProfilePage.getFirstNameTextBox(), editFirstName);
		verifyEquals(detailProfilePage.getFirstNameTextBox(), editLastName);
		verifyEquals(detailProfilePage.getEmailTextBox(), email);
		verifyEquals(detailProfilePage.getMobileTextBox(), editPhone);
		verifyEquals(detailProfilePage.getCompanyNameTextBox(), editCompanyName);
		verifyEquals(detailProfilePage.getCompanySiteTextBox(), editCompanySize);
		verifyEquals(detailProfilePage.getDateBirthTextBox(), dateBirth);
		verifyEquals(detailProfilePage.getTimeZoneSelected(), newTimeZone);
		verifyTrue(detailProfilePage.isSMSChecked());

	}

	public void TC_04_Change_Password_Success() {
		log.info("Check navigate to Change Password");
		detailProfilePage.clickToProfileIcon();
		detailProfilePage.clickToProfileLink();
		changePass=PageManagerPageObject.getChangePasswordPageObject(driver);
		log.info("Check title page");
		verifyTrue(changePass.isTilePageDisplayed());
		log.info("Input info");
		changePass.inputToOldPasswordTextBox(password);
		changePass.inputToNewPasswordTextBox(newpassword);
		changePass.inputToRePasswordTextBox(newpassword);
		changePass.clickToChangeButton();
		log.info("Check navigate to login");
		changePass.goToLoginPage("https://baa.izzimember.com/");
		log.info("Input password old to textbox, login fail, show message");
		loginPage=PageManagerPageObject.getLoginPage(driver);
		loginPage.inputToEmailTextBox(email);
		loginPage.inputToPasswordTextBox(password);
		verifyTrue(loginPage.isLoginFailMessageDisplayed());
		log.info("Input new password to textbox");
		loginPage.refeshPage();
		loginPage.inputToEmailTextBox(email);
		loginPage.inputToPasswordTextBox(newpassword);
		verifyTrue(loginPage.isLoginSuccessMessageDisplayed());
		
	}

	public void TC_03_Recovery_Password_Success() {
//		log.info("Check time load page");
//		Long timeload = loginPage.getMilisecondLoadPage("https://baa.izzimember.com");
		log.info("Check navigate to login page");
		loginPage.goToLoginPage("https://baa.izzimember.com");
		loginPage.clickToRecoveryPassword();
		log.info("Check navigate to recoveryPassword");
		recoveryPassword=PageManagerPageObject.getRecoveryPasswordPageObject(driver);
		verifyTrue(recoveryPassword.isTitlePageDisplayed());
		recoveryPassword.inputToEmailTextBox(email);
		recoveryPassword.clickToRecoveryButton();
		log.info("Check gmail");
		gmailPage=PageManagerPageObject.getGmailPageObject(driver);
		gmailPage.OpenGmail("https://accounts.google.com/signin");
		gmailPage.inputToEmailTextBox();
		gmailPage.clickToContinue();
		gmailPage.inputToPassword("Nga2981995");
		gmailPage.clickToContinue();
		gmailPage.clickToGmailLink();
		gmailPage.switchToPageByLink();
		
	}

	@AfterClass
	public void afterClass() {
	}

	public String getEmail() {
		Random rand = new Random();
		return "Test_IZZI" + rand.nextInt(9999) + "@gmail.com";
	}

	public String getPassword() {
		Random rand = new Random();
		return "ABCD" + rand.nextInt(9999999);
	}

	public String getNumberPhone() {
		Random rand = new Random();
		DecimalFormat phoneFmt = new DecimalFormat("######");
		return "0912" + phoneFmt.format(rand.nextInt(999999));
	}
	
	public static String getPhoneNumber() // returns the phone number formatted as a sequence of digits
    {

        String regex = "^(?:(?:Tel|Phone Number|Phone): )?(\\+?\\(?\\d{3}\\)?[-. ]\\d{3}[-. ]\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        String phoneNumber="";
        String line="XXXXXXXXXX";
        for (int i = 0; i < line.length(); i++) 
        {
              //if phone number format includes -, . , spaces, + sign in front
              if (line.matches("[+]?\\d?[- .]?(\\([0-9]\\d{2}\\)|[0-9]\\d{2})[- .]?\\d{3}[- .]?\\d{4}$")) {
                phoneNumber = line.replaceAll("[^\\d.]", "").replace("-", "").replace(".", "").replace(" ", "").replace("(", "").replace(")", "")
                        .replace("+", "");

              }
        }
        //System.out.println(phoneNumber);
        return phoneNumber;
    }

	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	HomePageObject homePage;
	ProfilePageObject profilePage;
	DetailProfilePageObject detailProfilePage;
	AbstractPageUploadFiles upload;
	ChangePasswordPageObject changePass;
	RecoveryPasswordPageObject recoveryPassword;
	GmailPageObject gmailPage;
}
