package PageUI_User;

public class LoginPageUI {
	public static final String TITLE_LOGIN_PAGE="//h3[text()=' Chào mừng bạn đã trở lại']";
	public static final String EMAIL_TEXTBOX="//input[@name='username']";
	public static final String PASSWORD_TEXTBOX="//input[@name='password']";
	public static final String LOGIN_BUTTON="//button[@type='submit']";
	public static final String REGISTER_LINK="//b[text()='Đăng kí']/parent::*";
	public static final String IFRAME="(//iframe)[1]";	
	public static final String CHAT_BOX="//div[@class='welcomePageModalSheetContent']//strong[contains(.,'Chat with BAA') and contains(.,'Business Analysis')]";
	public static final String CHAT_BOX_CLOSE="//div[@aria-label='close']";
	public static final String GO_TO_RECOVERY_PASSWORD_BUTTON="//b[text()='đây']/parent::a";
}
