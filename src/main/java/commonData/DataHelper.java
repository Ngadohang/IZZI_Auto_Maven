package commonData;

import java.util.Locale;

import com.github.javafaker.Faker;

public class DataHelper {
	
	private Locale locale =new Locale("en");
	private Faker faker= new Faker(locale);

	public static DataHelper getData() {
		return new DataHelper();
	}

	public String getAddress() {
		return faker.address().streetAddress();
	}
	
	public String getPhone() {
		return faker.phoneNumber().phoneNumber();
	}
	
	public String getFullName() {
		return faker.name().fullName();
	}
	public String getFirstName() {
		return faker.name().firstName();
	}
	public String getLastName() {
		return faker.name().lastName();
	}
	public String getCompanyName() {
		return faker.company().name();
	}
	
	
}
