package PageUI_Admin;

public class StoreElement {
	public static final String STORE_ITEM_MENU="//a[contains(.,'Quản lý kho')]//parent::li";
	public static final String STORE_SUB_ITEM_MENU="//a[contains(.,'Quản lý kho')]//parent::li/ul/li/a[contains(.,'Tạo mới')]/parent::li";
	public static final String STORE_LABEL_PAGE="//div[@class='page-title-subheading' and contains(.,'Thông tin kho hàng')]/parent::div[contains(.,'Kho hàng')]";
	public static final String STORE_TITLE="(//div[@class='card-header' and contains(.,'Tạo mới')])[1]";	
	public static final String NAME_STORE_TEXTBOX="//label[contains(.,'Tên kho')]/following-sibling::input";
	public static final String TAGS_TEXTBOX="//label[contains(.,'Tags')]/following-sibling::input";
	public static final String SKU_TEXTBOX="//label[contains(.,'Sku')]/following-sibling::input";
	public static final String DYNAMIC_TEXTBOX="//label[contains(.,'%s')]/following-sibling::input";
	public static final String DESCRIPTION_TEXTBOX="//label[contains(.,'Mô tả ngắn')]/following-sibling::input";
	public static final String LENGTH_TEXTBOX="//input[@placeholder='dài ...']";
	public static final String WIDTH_TEXTBOX="//input[@placeholder='rộng ...']";
	public static final String HIGHT_TEXTBOX="//input[@placeholder='cao ...']";
	
	public static final String POINT_X_TEXTBOX="//input[@placeholder='X ...']";
	public static final String POINT_Y_TEXTBOX="//input[@placeholder='Y ...']";
	public static final String PONIT_Z_TEXTBOX="//input[@placeholder='Z ...']";
	public static final String DESCRIPTION_TEXTAREA="//label[text()='Mô tả']/following-sibling::*/following-sibling::*//p";
	
	public static final String CLASSIFY_TEXTBOX_PARENT="//div[text()='Phân loại']/following-sibling::*//input/parent::*/parent::*/parent::*";
	public static final String CLASSIFY_TEXTBOX="//div[text()='Phân loại']/following-sibling::*//input";
	public static final String AVATAR_BUTTON="//div[text()='Ảnh đại diện']/following-sibling::*/button";
	public static final String TITLE_UPLOAD_FILE_POPUP="//a[text()='Ảnh']/parent::li/following-sibling::*/a[text()='Thư viện IZZI']";
	public static final String TITLE_ON_TAB_IMAGE="//p[text()='Hãy thử thả một số tệp vào đây hoặc bấm để chọn tệp để tải lên.']";
	public static final String DYNAMIC_LINK="//a[text()='%s']";
	public static final String DYNAMIC_AVATAR_NUMBER="(//div[@class='tab-pane active']/div/div/div)[%s]";
	public static final String AVATAR_LIST="//div[@class='tab-pane active']/div/div/div";
	public static final String SELECT_BUTTON="//div[@class='modal-content']//button[text()='Chọn']";
	public static final String DYNAMIC_STORE_STYLE="//div[text()='%s']";
	public static final String IMAGE_SELECT_BUTTON="//div[text()='Ảnh']/following-sibling::*/button";
	public static final String PARENT_STORE_TEXTBOX="//label[text()='Thuộc kho']/following-sibling::*/div/div/div/div/input";
	
	public static final String PARENT_CLASSIFICATION_SELECT="//label[text()='Phân loại cha']/following-sibling::*//input";
	public static final String CREATE_NEW_CLASSIFY_BUTTON="//div[text()='Phân loại']/div/button[text()='Tạo mới']";
	public static final String CLASSIFY_TITLE_POPUP="//h5[text()='Tạo mới phân loại']";
	public static final String CLASSIFY_NAME_TEXTBOX="//label[text()='Tên phân loại']/following-sibling::input";
	public static final String CREATE_CLASSIFY_BUTTON="//h5[text()='Tạo mới phân loại']/parent::*/following-sibling::*//span[text()='Tạo']/parent::*";
	public static final String SUCCESS_MESSAGER_POPUP="//h2[text()='Thành công']/parent::*/parent::*";
	//	locator will change
	public static final String ERROR_MESSAGER_POPUP="//h2[text()='Thất bại']/parent::*/parent::*";
	public static final String OK_BUTTON_ON_POPUP="//h2[text()='Thành công']/parent::*/following-sibling::*/button[text()='OK']";
	public static final String DELETE_ITEM_BUTTON="//div[text()='%s']/following-sibling::*";
	public static final String DELETE_ALL_ITEM_BUTTON="(//div[text()='%s']/ancestor::*/following-sibling::*//*[name()='svg'])[1]/parent::*";
	
	// upload ảnh thành công
	
	public static final String IMAGE_UPLOAD ="//p[text()='%s']/parent::*/preceding-sibling::*";
	public static final String SEARCH_TEXTBOX="//input[@name='keyword' and @placeholder='Từ khóa']";
	public static final String SEARCH_BUTTON="//button[text()='Tìm kiếm']";
	
	public static final String CREATE_ADDRESS_BUTTON="//div[text()='Address']//button";
	public static final String NAME_ADDRESS_TEXTBOX="//input[@id='name']";
	public static final String DESCRIPTIOM_ADDRESS_TEXTBOX="//input[@id='description']";
	public static final String ENTER_LOCATION_TEXTBOX="//input[@placeholder='Enter a location']";
	public static final String ADDRESS_SAVE_BUTTON="//button[text()='Lưu']";
	public static final String ADDRESS_SELECTION="//div[text()='Address']/following-sibling::*//following-sibling::*//input";
	public static final String ADDRESS_DISPLAY_ON_TEXTBOX="//div[text()='Address']/following-sibling::*//div[contains(.,'%s')]";
	public static final String SAVE_BUTTON="//span[text()='Lưu']/parent::*";
	
	//element at list store
	public static final String LIST_STORE_SUBMENU_ITEM="//a[text()='Quản lý kho']/following-sibling::*//a[text()='Danh sách']/parent::*";
	public static final String TITLTE_LIST_STORE_PAGE="//div[text()='Danh sách kho']";
	public static final String FILTER_BUTTON="//button[text()='Lọc']";
	public static final String SEARCH_BUTTON_IN_LIST_STORE="//button[text()='Áp dụng']";
	public static final String SEARCH_TEXTBOX_IN_LIST_STORE="//input[@id='text-search']";
	public static final String EDIT_STORE_BUTTON="//td[text()='%s']//following-sibling::*//button[@title='Sửa']";
	
	//edit store
	public static final String PARENT_STORE_SELECT="//label[text()='Thuộc kho']/following-sibling::*//div[text()='%s']";
	
	
}
