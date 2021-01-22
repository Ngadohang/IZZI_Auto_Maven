package com.IZZI.Admin;

import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageUIIZZI.LoginElement;
import PageUIIZZI.StoreElement;
import common.AbstractPage;
import common.AbstractTest;

public class ADD_STORE_STYLE_SUCCESS extends AbstractTest {
	private WebDriver driver;
	static String nameParent,nameChild;
	AbstractPage common = new AbstractPage(driver);

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getDriver(browserName, url);
		log.info("Vào trang chủ, đăng nhập thành công");
		common.waitForElementVisible(driver, LoginElement.E_MAIL_TEXTBOX);
		common.senkeyToElement(driver, LoginElement.E_MAIL_TEXTBOX, "dungtho090883@gmail.com");
		common.waitForElementVisible(driver, LoginElement.MẬT_KHẨU_TEXTBOX);
		common.senkeyToElement(driver, LoginElement.MẬT_KHẨU_TEXTBOX, "GAVTQT7173");
		common.waitForElementVisible(driver, LoginElement.ĐĂNG_NHẬP_BUTTON);
		common.clickToElement(driver, LoginElement.ĐĂNG_NHẬP_BUTTON);
		common.waitForElementVisible(driver, LoginElement.POPUP_HOME);
		common.clickToElement(driver, LoginElement.POPUP_HOME);
		common.scrollToElement(driver, StoreElement.STORE_ITEM_MENU);
		common.waitForElementVisible(driver, StoreElement.STORE_ITEM_MENU);
		common.clickToElement(driver, StoreElement.STORE_ITEM_MENU);
		common.waitForElementVisible(driver, StoreElement.STORE_SUB_ITEM_MENU);
		common.clickToElement(driver, StoreElement.STORE_SUB_ITEM_MENU);
	}

	@Test
	public void TC_01_Create_Search_Delete_Store_Parent_Success() {
		log.info("Create parent store in creat new store");
		nameParent= nameParentStore();
		common.waitToElementClickable(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		log.info("Check popup create new classification is displayed");
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_TITLE_POPUP);
		verifyTrue(common.isElementDisplay(driver, StoreElement.CLASSIFY_TITLE_POPUP));
		log.info("input name classification");
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, nameParent);
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		log.info("Check success message is display");
		verifyTrue(common.isElementDisplay(driver, StoreElement.SUCCESS_MESSAGER_POPUP));
		common.waitToElementClickable(driver, StoreElement.OK_BUTTON_ON_POPUP);
		common.clickToElement(driver, StoreElement.OK_BUTTON_ON_POPUP);
		log.info("Search parent store");
		common.waitForElementVisible(driver,  StoreElement.CLASSIFY_TEXTBOX);
		common.clickAndHoldToElement(driver, StoreElement.CLASSIFY_TEXTBOX_PARENT);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_TEXTBOX, nameParent);
		common.sleepInSecond(3);
		common.senKeyBoarchToElement(driver, StoreElement.CLASSIFY_TEXTBOX, Keys.ENTER);
		log.info("Check parent store is display");
		verifyTrue(common.isElementPresence(driver, StoreElement.DYNAMIC_STORE_STYLE, nameParent));
		log.info("Delete parent store");
		common.waitToElementClickable(driver, StoreElement.DELETE_ITEM_BUTTON,nameParent);
		common.clickToElement(driver, StoreElement.DELETE_ITEM_BUTTON,nameParent);
		verifyTrue(common.isElementUnDisplayExistDom(driver,StoreElement.DYNAMIC_STORE_STYLE,nameParent));
	}
	
	
	public void TC_02_Create_Search_Delete_Store_Child_Success() {
		nameChild= nameChildStore();
		log.info("Create child store in create new store");
		common.waitToElementClickable(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		common.waitForElementVisible(driver,  StoreElement.PARENT_CLASSIFICATION_SELECT);
		common.clickAndHoldToElement(driver, StoreElement.PARENT_CLASSIFICATION_SELECT);
		common.senkeyToElement(driver, StoreElement.PARENT_CLASSIFICATION_SELECT, nameParent);
		common.sleepInSecond(3);
		common.senKeyBoarchToElement(driver, StoreElement.PARENT_CLASSIFICATION_SELECT, Keys.ENTER);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX,nameChild);
		common.waitToElementClickable(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.waitToElementClickable(driver, StoreElement.OK_BUTTON_ON_POPUP);
		common.clickToElement(driver, StoreElement.OK_BUTTON_ON_POPUP);
		log.info("Then seach,parent store is display");
		common.waitForElementVisible(driver,  StoreElement.CLASSIFY_TEXTBOX);
		common.clickAndHoldToElement(driver, StoreElement.CLASSIFY_TEXTBOX_PARENT);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_TEXTBOX, nameChild);
		common.sleepInSecond(2);
		common.senKeyBoarchToElement(driver, StoreElement.CLASSIFY_TEXTBOX, Keys.ENTER);
		verifyTrue(common.isElementPresence(driver, StoreElement.DYNAMIC_STORE_STYLE, nameChild));
		log.info("Delete child store");
		common.waitToElementClickable(driver, StoreElement.DELETE_ITEM_BUTTON,nameChild);
		common.clickToElement(driver, StoreElement.DELETE_ITEM_BUTTON,nameChild);
		verifyTrue(common.isElementUnDisplayExistDom(driver,StoreElement.DYNAMIC_STORE_STYLE,nameChild));
	}


	public void TC_03_Select_More_Then_Delete_All_Item() {
		log.info("select more item");
		common.waitForElementVisible(driver,  StoreElement.CLASSIFY_TEXTBOX);
		common.clickAndHoldToElement(driver, StoreElement.CLASSIFY_TEXTBOX_PARENT);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_TEXTBOX, nameParent);
		common.sleepInSecond(2);
		common.senKeyBoarchToElement(driver, StoreElement.CLASSIFY_TEXTBOX, Keys.ENTER);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_TEXTBOX, nameChild);
		common.sleepInSecond(2);
		common.senKeyBoarchToElement(driver, StoreElement.CLASSIFY_TEXTBOX, Keys.ENTER);		
		verifyTrue(common.isElementPresence(driver, StoreElement.DYNAMIC_STORE_STYLE,nameParent));
		verifyTrue(common.isElementPresence(driver, StoreElement.DYNAMIC_STORE_STYLE,nameChild));
		log.info("delete all item");
		common.waitToElementClickable(driver, StoreElement.DELETE_ALL_ITEM_BUTTON,nameChild);
		common.clickToElement(driver,  StoreElement.DELETE_ALL_ITEM_BUTTON,nameChild);
		verifyTrue(common.isElementUnDisplayExistDom(driver,StoreElement.DYNAMIC_STORE_STYLE,nameParent));
		verifyTrue(common.isElementUnDisplayExistDom(driver,StoreElement.DYNAMIC_STORE_STYLE,nameChild));
	}

	
	public void TC_04_Input_Name_Not_Exist_Search_Option() {
		String nameNotExist="kho loại X";
		log.info("check input to name seachr textbox ");
		common.waitForElementVisible(driver,  StoreElement.CLASSIFY_TEXTBOX);
		common.clickAndHoldToElement(driver, StoreElement.CLASSIFY_TEXTBOX_PARENT);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_TEXTBOX, nameNotExist);
		common.sleepInSecond(2);
		common.senKeyBoarchToElement(driver, StoreElement.CLASSIFY_TEXTBOX, Keys.ENTER);
		verifyTrue(common.isElementUnDisplayExistDom(driver, StoreElement.DYNAMIC_STORE_STYLE, nameNotExist));
	}

	
	public void TC_06_InValid_Classify_Name() {
		log.info("name textbox empty,text message is displayed");
		common.waitToElementClickable(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(common.isElementDisplay(driver, StoreElement.DYNAMIC_STORE_STYLE, "Trường bắt buộc"));
		log.info("Input space character to name textbox");
		common.refreshCurrentPage(driver);
		common.waitToElementClickable(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_NEW_CLASSIFY_BUTTON);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX,"   ");
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
		log.info("Input html code to name textbox");
		verifyTrue(common.isElementDisplay(driver,StoreElement.ERROR_MESSAGER_POPUP));
		common.refreshCurrentPage(driver);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, "");
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
		log.info("Input javascript code to name textbox");
		common.refreshCurrentPage(driver);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, "");
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
		log.info("Input sql code to name textbox");
		common.refreshCurrentPage(driver);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, "");
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
		log.info("Input more than 255 character to name textbox");
		common.refreshCurrentPage(driver);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, "");
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
		log.info("Input child store name like parent store name");
		common.refreshCurrentPage(driver);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, nameParent);
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
		log.info("Input store name exists");
		common.refreshCurrentPage(driver);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, "");
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
		log.info("Input limit character to name textbox");
		common.refreshCurrentPage(driver);
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_NAME_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_NAME_TEXTBOX, "");
		common.waitForElementVisible(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		common.clickToElement(driver, StoreElement.CREATE_CLASSIFY_BUTTON);
		verifyTrue(false);
	}

	public String nameParentStore() {
		String nameFix = "Store_Parent_";
		Random rand = new Random();
		return nameFix + rand.nextInt(9999);
	}
	
	public String nameChildStore() {
		String nameFix = "Store_Child_";
		Random rand = new Random();
		return nameFix + rand.nextInt(9999);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
