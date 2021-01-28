package PageUI_User;

public class ChangePasswordPageUI {
	public static final String PROFILE_LINK="//a[text()='Profile']";
	public static final String ICON_PROFILE="(//img[@alt='Avatar'])[1]/parent::*[@href='/profile']";
	
	public static final String PASSWORD_CURRENT="//input[@name='currentPassword']";
	public static final String NEW_PASSWORD="//input[@name='newPassword']";
	public static final String RE_PASSWORD="//input[@name='rePassword']";
	public static final String CHANGE_PASSWORD_BUTTON="//button[text()='Đổi mật khẩu']";
}
