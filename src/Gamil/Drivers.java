package Gamil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {

	public static WebDriver d;
	
	public static void init() throws Exception 
	{
		String current_path =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",current_path+"\\Drivers\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.manage().window().maximize();
	
}
	public static void open_url(String url) throws Exception
	{
		d.get(url);
	}
}