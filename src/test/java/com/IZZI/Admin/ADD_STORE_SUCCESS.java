package com.IZZI.Admin;

import java.awt.AWTException;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageUIIZZI.LoginElement;
import PageUIIZZI.StoreElement;
import common.AbstractPage;
import common.AbstractPageUploadFiles;
import common.AbstractTest;
import common.GlobalConstants;

public class ADD_STORE_SUCCESS extends AbstractTest {
	WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browser, String url) {
		driver = getDriver(browser, url);
		common = new AbstractPage(driver);
		log.info("Vào trang chủ, đăng nhập thành công");
		common.waitForElementVisible(driver, LoginElement.E_MAIL_TEXTBOX);
		common.senkeyToElement(driver, LoginElement.E_MAIL_TEXTBOX, "dungtho090883@gmail.com");
		common.waitForElementVisible(driver, LoginElement.MẬT_KHẨU_TEXTBOX);
		common.senkeyToElement(driver, LoginElement.MẬT_KHẨU_TEXTBOX, "GAVTQT7173");
		common.waitForElementVisible(driver, LoginElement.ĐĂNG_NHẬP_BUTTON);
		common.clickToElement(driver, LoginElement.ĐĂNG_NHẬP_BUTTON);
		common.waitForElementVisible(driver, LoginElement.POPUP_HOME);
		common.clickToElement(driver, LoginElement.POPUP_HOME);
	}

	@Test
	public void TC_01_Create_Parent_Store_Success() {
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
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, nameStore(), "Tên kho");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Sku");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, skuStore(), "Sku");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Tags");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, tagsStore(), "Tags");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Sức chứa tối đa");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, "12", "Sức chứa tối đa");
		common.waitForElementVisible(driver, StoreElement.DYNAMIC_TEXTBOX, "Đơn vị sức chứa");
		common.senkeyToElement(driver, StoreElement.DYNAMIC_TEXTBOX, "cái", "Đơn vị sức chứa");
		common.waitForElementVisible(driver, StoreElement.LENGTH_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.LENGTH_TEXTBOX, "25");
		common.waitForElementVisible(driver, StoreElement.WIDTH_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.WIDTH_TEXTBOX, "25");
		common.waitForElementVisible(driver, StoreElement.HIGHT_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.HIGHT_TEXTBOX, "25");
		common.waitForElementVisible(driver, StoreElement.POINT_X_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.POINT_X_TEXTBOX, "25");
		common.waitForElementVisible(driver, StoreElement.POINT_Y_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.POINT_Y_TEXTBOX, "25");
		common.waitForElementVisible(driver, StoreElement.PONIT_Z_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.PONIT_Z_TEXTBOX, "25");
		common.waitForElementVisible(driver, StoreElement.DESCRIPTION_TEXTBOX);
		common.senkeyToElement(driver, StoreElement.DESCRIPTION_TEXTBOX, "Tạo kho mới");
		common.waitForElementVisible(driver, StoreElement.DESCRIPTION_TEXTAREA);
		common.senkeyToElement(driver, StoreElement.DESCRIPTION_TEXTAREA, "Tạo kho mới");
		common.waitForElementVisible(driver, StoreElement.CLASSIFY_TEXTBOX);
		common.clickAndHoldToElement(driver, StoreElement.CLASSIFY_TEXTBOX_PARENT);
		common.senkeyToElement(driver, StoreElement.CLASSIFY_TEXTBOX,ADD_STORE_STYLE_SUCCESS.nameParent);
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
			common.waitToElementClickable(driver,  GlobalConstants.UPLOAD_BUTTON);
			common.clickToElement(driver, GlobalConstants.UPLOAD_BUTTON);
			upload = new AbstractPageUploadFiles(driver);
			upload.uploadFileByClipboardRobot("uploadFile","image2.jpg");
		} catch (Exception e) {
			System.out.println("No find file upload");
			e.printStackTrace();
		}
		log.info("check image upload is displayed");
		verifyTrue(upload.isFileUploadDisplay(driver, StoreElement.IMAGE_UPLOAD, "image2.jpg"));
		common.waitForElementInvisible(driver, StoreElement.LAZY_LOADING_SUCCESS);
		common.waitForElementVisible(driver, StoreElement.SEARCH_TEXTBOX);
		common.senkeyToElement(driver,  StoreElement.SEARCH_TEXTBOX, "image2.jpg");
		common.waitToElementClickable(driver, StoreElement.SEARCH_BUTTON);
		common.clickToElement(driver, StoreElement.SEARCH_BUTTON);
		common.waitToElementClickable(driver, StoreElement.IMAGE_UPLOAD, "image2.jpg");
		common.clickToElement(driver,StoreElement.IMAGE_UPLOAD, "image2.jpg");
		common.waitToElementClickable(driver, StoreElement.SELECT_BUTTON);
		common.clickToElement(driver, StoreElement.SELECT_BUTTON);
		log.info("select address customer");
		common.waitForElementVisible(driver, StoreElement.ADDRESS_SELECTION);
		common.senkeyToElement(driver, StoreElement.ADDRESS_SELECTION, ADD_ADDRESS_SUCCESS.address);
		common.senKeyBoarchToElement(driver, StoreElement.ADDRESS_SELECTION, Keys.ENTER);
		common.waitToElementClickable(driver, StoreElement.SAVE_BUTTON);
		common.clickToElement(driver, StoreElement.SAVE_BUTTON);
	}
	
	public void TC_02_Create_Child_Store_Success() {
		
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
		 //driver.quit();
	}

	AbstractPage common;
	AbstractPageUploadFiles upload;

}
