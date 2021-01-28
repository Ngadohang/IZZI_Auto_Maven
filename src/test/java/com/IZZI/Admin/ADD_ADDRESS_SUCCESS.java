package com.IZZI.Admin;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageUI_Admin.LoginPageUI;
import PageUI_Admin.StoreElement;
import common.AbstractPage;
import common.AbstractTest;
import commonData.DataHelper;

public class ADD_ADDRESS_SUCCESS extends AbstractTest{
	private WebDriver driver;
	static String address;
	DataHelper data;
	AbstractPage common = new AbstractPage(driver);

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getDriver(browserName, url);
		data= data.getData();
		common.waitForElementVisible(driver, LoginPageUI.E_MAIL_TEXTBOX);
		common.senkeyToElement(driver, LoginPageUI.E_MAIL_TEXTBOX, "dungtho090883@gmail.com");
		common.waitForElementVisible(driver, LoginPageUI.MẬT_KHẨU_TEXTBOX);
		common.senkeyToElement(driver, LoginPageUI.MẬT_KHẨU_TEXTBOX, "GAVTQT7173");
		common.waitForElementVisible(driver, LoginPageUI.ĐĂNG_NHẬP_BUTTON);
		common.clickToElement(driver, LoginPageUI.ĐĂNG_NHẬP_BUTTON);
		common.waitForElementVisible(driver, LoginPageUI.POPUP_HOME);
		common.clickToElement(driver, LoginPageUI.POPUP_HOME);
		common.scrollToElement(driver, StoreElement.STORE_ITEM_MENU);
		common.waitForElementVisible(driver, StoreElement.STORE_ITEM_MENU);
		common.clickToElement(driver, StoreElement.STORE_ITEM_MENU);
		common.waitForElementVisible(driver, StoreElement.STORE_SUB_ITEM_MENU);
		common.clickToElement(driver, StoreElement.STORE_SUB_ITEM_MENU);
	}
	
	@Test
	public void TC_01_Create_Search_Seclect_Address_Success() {
		address= data.getAddress();
		common.scrollToElement(driver, StoreElement.CREATE_ADDRESS_BUTTON);
		common.waitToElementClickable(driver, StoreElement.CREATE_ADDRESS_BUTTON);
		common.clickElementByJs(driver, StoreElement.CREATE_ADDRESS_BUTTON);
		common.waitForElementVisible(driver, StoreElement.NAME_ADDRESS_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.NAME_ADDRESS_TEXTBOX, address);
		common.waitForElementVisible(driver, StoreElement.DESCRIPTIOM_ADDRESS_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.DESCRIPTIOM_ADDRESS_TEXTBOX, address);
		common.waitForElementVisible(driver, StoreElement.ENTER_LOCATION_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.ENTER_LOCATION_TEXTBOX, address);
		common.waitToElementClickable(driver, StoreElement.ADDRESS_SAVE_BUTTON);
		common.clickElementByJs(driver, StoreElement.ADDRESS_SAVE_BUTTON);
		verifyTrue(common.isElementDisplay(driver, StoreElement.SUCCESS_MESSAGER_POPUP));
		common.waitForElementVisible(driver, StoreElement.ADDRESS_SELECTION);
		common.senkeyToElement(driver, StoreElement.ADDRESS_SELECTION, address);
		common.senKeyBoarchToElement(driver, StoreElement.ADDRESS_SELECTION, Keys.ENTER);
		verifyTrue(common.isElementExistInListDisplayed(driver, StoreElement.ADDRESS_DISPLAY_ON_TEXTBOX,address));
		common.waitToElementClickable(driver, StoreElement.SAVE_BUTTON);
		common.clickToElement(driver, StoreElement.SAVE_BUTTON);
		
	}
	

	public void TC_02_Empty_Address() {
			
	}
	
	
	public void TC_03_Only_Empty_Name_Address() {
	//không tạo được address
	}
	

	public void TC_04_Only_Empty_Description_Address() {
	//Tạo được address
	}

	public void TC_05_Only_Empty_Enter_Address() {
	//không tạo được address
	}
	
	
	public void TC_06_Input_Name_Address_Space() {
	//không tạo được address
	}
	
	
	public void TC_07_Input_Description_Address_Space() {
	//Có thể tạo được nhưng không nhận value space
	}	
	
	public void TC_08_Name_Address_Not_Contains_Location() {
	//không tạo được address
	}
	
	public void TC_09_Create_Address_Exist() {
	//không tạo được address
	}
	
	public void TC_10_Name_Address_More_Than_255_Character() {}
	

	public void TC_11_Desciption_Address_More_Thanh_255_Character() {}
	
	public String getAddress() {
		Random rand= new Random();
		return ""+ rand.nextInt(9999);
	}
	@Test
	public void afterClass() {
		//driver.quit();
	}
}
