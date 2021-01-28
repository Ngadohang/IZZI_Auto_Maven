package common;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		  String regex = "^(?:(?:Tel|Phone Number|Phone): )?(\\+?\\(?\\d{3}\\)?[-. ]\\d{3}[-. ]\\d{4})$";
	        Pattern pattern = Pattern.compile(regex);
	        String phoneNumber="";
	        String line="12345678910";
	        for (int i = 0; i < line.length(); i++) 
	        {
	              //if phone number format includes -, . , spaces, + sign in front
	              if (line.matches("[+]?\\d?[- .]?(\\([0-9]\\d{2}\\)|[0-9]\\d{2})[- .]?\\d{3}[- .]?\\d{4}$")) {
	                phoneNumber = line.replaceAll("[^\\d.]", "").replace("-", "").replace(".", "").replace(" ", "").replace("(", "").replace(")", "")
	                        .replace("+", "");

	              }
	        }
	        System.out.println(phoneNumber);
	        
	}

}
