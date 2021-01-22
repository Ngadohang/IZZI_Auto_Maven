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
}
