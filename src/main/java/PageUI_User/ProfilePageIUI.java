package PageUI_User;

public class ProfilePageIUI {
	
	public static final String INFO_PROFILE="//h3[text()='%s']/following-sibling::div[contains(.,'%s')]/following-sibling::*//*[text()='%s']/parent::*/following-sibling::*/*[text()='%s']";
	public static final String EDIT_BUTTON="//a[text()='Chỉnh sửa thông tin']";
	public static final String FIRST_NAME_TEXTBOX="//h5[contains(.,'Họ')]/following-sibling::*";
	public static final String LAST_NAME_TEXTBOX="//h5[contains(.,'Tên')]/following-sibling::*[@name='lastName']";
	public static final String EMAIL_TEXTBOX="//h5[contains(.,'Tên')]/parent::*/following-sibling::*/input[@name='email']";
	public static final String MOBLIE_TEXTBOX="//input[@name='mobile']";
	public static final String COMPANY_TEXTBOX="//input[@name='companyName']";
	public static final String SITE_COMPANY_TEXTBOX="//input[@name='companySite']";
	public static final String DATE_TEXTBOX="//h5[contains(.,'Ngày sinh')]/following-sibling::*//input";
	public static final String ACCOUNT_TEXTBOX="//h5[contains(.,'Tài khoản')]/following-sibling::*[@name='firstName']";
	public static final String ACCOUNT_EMAIL_TEXTBOX="//h5[contains(.,'Tài khoản')]/parent::*/following-sibling::*/input[@name='email']";
	public static final String INFO_SAVE_BUTTON="//h5[contains(.,'Ngày sinh')]/parent::*/following-sibling::*/button[text()='Lưu']";
	public static final String ACCOUNT_SAVE_BUTTON="//h5[contains(.,'Trao đổi')]/ancestor::*/following-sibling::*/button[text()='Lưu']";
	public static final String SMS_CHECKBOX="//input[@name='communication_sms']";
	public static final String TIMEZONE_SELECTION="//select[@name='timeZone']";
	public static final String PROFILE_IMAGE="//a[text()='Lưu']/preceding-sibling::*//img";
	public static final String EDIT_SUCCESS="//h2[text()='Cập nhật thành công']";
	public static final String OK_BUTTON="//button[text()='OK']";
	public static final String IMAGE_UPLOADED="//div[@class='profile-image']/img";
	public static final String IMAGE_SAVE="//div[@class='uk-position-center']/parent::*/following-sibling::*[text()='Lưu']";
	public static final String TITLE_PROFILE="//h2[text()='Cài đặt']/following-sibling::*//h5[contains(.,'Thông tin cá nhân')]";
}