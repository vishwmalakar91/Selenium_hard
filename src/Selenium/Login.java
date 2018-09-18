package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login{
	
	public static void main(String[] args) {
		String current_path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",current_path+"\\Drivers\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("https://github.com");
	    d.quit();
	
	}
}
