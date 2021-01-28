package com.IZZI.Admin;

import java.awt.AWTException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageUI_Admin.LoginPageUI;
import PageUI_Admin.StoreElement;
import common.AbstractPage;
import common.AbstractPageUploadFiles;
import common.AbstractTest;
import common.GlobalConstants;

public class ADD_STORE_SUCCESS extends AbstractTest {
	WebDriver driver;
	String address = "170 Đê La Thành, Ô Chợ Dừa, Đống Đa, Hà Nội";
	String nameParent = "Store_Parent_1472";
	String parentStore, childStore;
	Date date = new Date();

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browser, String url) {
		driver = getDriver(browser, url);
		common = new AbstractPage(driver);
		log.info("Login HomePage");
		common.waitForElementVisible(driver, LoginPageUI.E_MAIL_TEXTBOX);
		common.senkeyToElement(driver, LoginPageUI.E_MAIL_TEXTBOX, "dungtho090883@gmail.com");
		common.waitForElementVisible(driver, LoginPageUI.MẬT_KHẨU_TEXTBOX);
		common.senkeyToElement(driver, LoginPageUI.MẬT_KHẨU_TEXTBOX, "GAVTQT7173");
		common.waitForElementVisible(driver, LoginPageUI.ĐĂNG_NHẬP_BUTTON);
		common.clickToElement(driver, LoginPageUI.ĐĂNG_NHẬP_BUTTON);
		common.waitForElementVisible(driver, LoginPageUI.POPUP_HOME);
		common.clickToElement(driver, LoginPageUI.POPUP_HOME);
	}

	@Test
	public void TC_01_Create_Search_View_Parent_Store_Success() {

		log.info("Click to item menu store manageration");
		common.scrollToElement(driver, StoreElement.STORE_ITEM_MENU);
		common.waitForElementVisible(driver, StoreElement.STORE_ITEM_MENU);
		common.clickToElement(driver, StoreElement.STORE_ITEM_MENU);
		log.info("Click to sub item 'create new store'");
		common.waitForElementVisible(driver, StoreElement.STORE_SUB_ITEM_MENU);
		common.clickToElement(driver, StoreElement.STORE_SUB_ITEM_MENU);
		log.info("Check create new store screen is displayed");
		verifyTrue(common.isElementDisplay(driver, StoreElement.STORE_SUB_ITEM_MENU));
		log.info("Check title create new store is display");
		verifyTrue(common.isElementDisplay(driver, StoreElement.STORE_TITLE));
		log.info("Input need data");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Tên kho");
		parentStore = nameStore();
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, parentStore, "Tên kho");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Sku");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, skuStore(), "Sku");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Tags");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, tagsStore(), "Tags");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Sức chứa tối đa");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, "12", "Sức chứa tối đa");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Đơn vị sức chứa");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, "cái", "Đơn vị sức chứa");
		common.waitForElementVisible(driver, StoreElement.LENGTH_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.LENGTH_TEXTBOX, "15");
		common.waitForElementVisible(driver, StoreElement.WIDTH_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.WIDTH_TEXTBOX, "15");
		common.waitForElementVisible(driver, StoreElement.HIGHT_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.HIGHT_TEXTBOX, "15");
		common.waitForElementVisible(driver, StoreElement.POINT_X_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.POINT_X_TEXTBOX, "1");
		common.waitForElementVisible(driver, StoreElement.POINT_Y_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.POINT_Y_TEXTBOX, "1");
		common.waitForElementVisible(driver, StoreElement.PONIT_Z_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.PONIT_Z_TEXTBOX, "1");
		common.waitForElementVisible(driver, StoreElement.DESCRIPTION_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.DESCRIPTION_TEXTBOX, "Tạo kho mới");
		common.waitForElementVisible(driver, StoreElement.DESCRIPTION_TEXTAREA);
		common.senkeyToElement(driver, StoreElement.DESCRIPTION_TEXTAREA, "Tạo kho mới");
		common.waitForElementPresence(driver, StoreElement.CLASSIFY_TEXTBOX);
		common.clickAndHoldToElement(driver, StoreElement.CLASSIFY_TEXTBOX_PARENT);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_TEXTBOX, nameParent);
		common.sleepInSecond(2);
		common.senKeyBoarchToElement(driver, StoreElement.CLASSIFY_TEXTBOX, Keys.ENTER);
		common.waitForElementVisible(driver, StoreElement.AVATAR_BUTTON);
		common.clickToElement(driver, StoreElement.AVATAR_BUTTON);
		log.info("Check popup upload ảnh display");
		common.waitForElementVisible(driver, StoreElement.TITLE_UPLOAD_FILE_POPUP);
		verifyTrue(common.isElementDisplay(driver, StoreElement.TITLE_UPLOAD_FILE_POPUP));
		log.info("select image represent");
		common.waitToElementClickable(driver, StoreElement.DYNAMIC_LINK, "Thư viện IZZI");
		common.clickToElement(driver, StoreElement.DYNAMIC_LINK, "Thư viện IZZI");
		log.info("check image display on tab library");
		verifyTrue(common.isImageExist(driver, StoreElement.AVATAR_LIST, "style"));
		common.waitToElementClickable(driver, StoreElement.DYNAMIC_AVATAR_NUMBER, "1");
		common.clickToElement(driver, StoreElement.DYNAMIC_AVATAR_NUMBER, "1");
		common.waitToElementClickable(driver, StoreElement.SELECT_BUTTON);
		common.clickToElement(driver, StoreElement.SELECT_BUTTON);
		log.info("select more image on library");
		common.scrollToElement(driver, StoreElement.IMAGE_SELECT_BUTTON);
		common.waitToElementClickable(driver, StoreElement.IMAGE_SELECT_BUTTON);
		common.clickToElement(driver, StoreElement.IMAGE_SELECT_BUTTON);
		log.info("Check title on tab image");
		verifyTrue(common.isElementDisplay(driver, StoreElement.TITLE_ON_TAB_IMAGE));
		log.info("check upload file image success on tab image");
		try {
			common.waitToElementClickable(driver, GlobalConstants.UPLOAD_BUTTON);
			common.clickToElement(driver, GlobalConstants.UPLOAD_BUTTON);
			upload = new AbstractPageUploadFiles(driver);
			upload.uploadFileByClipboardRobot("uploadFile", "image2.jpg");
		} catch (Exception e) {
			System.out.println("No find file upload");
			e.printStackTrace();
		}
//		verifyTrue(common.isElementDisplay(driver, StoreElement.SUCCESS_MESSAGER_POPUP));
		common.sleepInSecond(5);
		log.info("check image uploaded is displayed");
		verifyTrue(upload.isFileUploadDisplay(driver, StoreElement.IMAGE_UPLOAD, "image2.jpg"));
		common.waitForElementVisible(driver, StoreElement.SEARCH_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.SEARCH_TEXTBOX, "image2.jpg");
		common.waitToElementClickable(driver, StoreElement.SEARCH_BUTTON);
		common.clickToElement(driver, StoreElement.SEARCH_BUTTON);
		common.waitToElementClickable(driver, StoreElement.IMAGE_UPLOAD, "image2.jpg");
		common.clickToElement(driver, StoreElement.IMAGE_UPLOAD, "image2.jpg");
		common.waitToElementClickable(driver, StoreElement.SELECT_BUTTON);
		common.clickToElement(driver, StoreElement.SELECT_BUTTON);
		common.waitForElementPresence(driver, StoreElement.ADDRESS_SELECTION);
		common.senkeyToElement(driver, StoreElement.ADDRESS_SELECTION, address);
		common.sleepInSecond(2);
		common.senKeyBoarchToElement(driver, StoreElement.ADDRESS_SELECTION, Keys.ENTER);
		common.waitToElementClickable(driver, StoreElement.SAVE_BUTTON);
		common.clickToElement(driver, StoreElement.SAVE_BUTTON);
		log.info("Check create a new store success message");
		verifyTrue(common.isElementDisplay(driver, StoreElement.OK_BUTTON_ON_POPUP));
		common.waitToElementClickable(driver, StoreElement.OK_BUTTON_ON_POPUP);
		common.clickToElement(driver, StoreElement.OK_BUTTON_ON_POPUP);
		log.info("Search Parent Store In List Store Screen");
		common.waitToElementClickable(driver, StoreElement.LIST_STORE_SUBMENU_ITEM);
		common.clickToElement(driver, StoreElement.LIST_STORE_SUBMENU_ITEM);
		log.info("Check navigate to list store screen");
		verifyTrue(common.isElementDisplay(driver, StoreElement.TITLTE_LIST_STORE_PAGE));
		common.waitToElementClickable(driver, StoreElement.FILTER_BUTTON);
		common.clickToElement(driver, StoreElement.FILTER_BUTTON);
		common.waitForElementVisible(driver, StoreElement.SEARCH_TEXTBOX_IN_LIST_STORE);
		common.senkeyToElement(driver, StoreElement.SEARCH_TEXTBOX_IN_LIST_STORE, parentStore);
		common.waitToElementClickable(driver, StoreElement.SEARCH_BUTTON_IN_LIST_STORE);
		common.clickToElement(driver, StoreElement.SEARCH_BUTTON_IN_LIST_STORE);
		log.info("Check info new store");
		log.info("Check unique new store is displayed");
		verifyEquals(common.contElementSize(driver, "//td[text()='']/parent::*", parentStore), 1);
		log.info("Check address new store");
		verifyEquals(common.getStoreInfoNewOnTable(driver, parentStore, "Địa Chỉ"), "");
		log.info("Check style store is displayed");
		verifyEquals(common.getStoreInfoNewOnTable(driver, parentStore, "Loại"), "");
		log.info("check status store");
		verifyTrue(common.isElementDisplay(driver, StoreElement.DYNAMIC_STORE_STYLE, "Không hoạt động"));
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String timenow = formatter.format(date);
		log.info("check time create new store");
		verifyEquals(common.getStoreInfoNewOnTable(driver, parentStore, "Ngày tạo"), "");
		log.info("check lasttime fix new store");
		verifyEquals(common.getStoreInfoNewOnTable(driver, parentStore, "Ngày sửa cuối"), "");
	}

	@Test
	public void TC_02_Edit_Parent_Store_Success() {
		log.info("click to edit button");
		common.waitToElementClickable(driver, StoreElement.EDIT_STORE_BUTTON);
		common.clickToElement(driver, StoreElement.EDIT_STORE_BUTTON);
		log.info("check navigate to edit page");
		
		log.info("Check parent store is displayed");
		log.info("Check name store is displayed");
		log.info("Tags store is displayed");
		log.info("Sku store is displayed");
		

	}

	@Test
	public void TC_03_Delete_Parent_Store_Success() {
	}

	public String nameStore() {
		String nameFix = "New Store";
		Random rand = new Random();
		return nameFix + rand.nextInt(9999);
	}

	public String skuStore() {
		Random rand = new Random();
		return "SKU" + rand.nextInt(9999);
	}

	public String tagsStore() {
		Random rand = new Random();
		return "TAGS" + rand.nextInt(9999);
	}

	@AfterClass
	public void afterClass() {
		// removeDriver();
	}

	AbstractPage common;
	AbstractPageUploadFiles upload;

}
