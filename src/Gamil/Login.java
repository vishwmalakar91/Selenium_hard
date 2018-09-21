package Gamil;

import org.openqa.selenium.By;

public class Login extends Drivers{
	
	public static void login(String email,String password) throws Exception
{
		d.findElement(By.xpath(".//input[@aria-label=\"Email or phone\"]")).sendKeys(email);
		d.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath(".//input[@aria-label=\"Enter your password\"]")).sendKeys(password);
		d.findElement(By.id("passwordNext")).click();
		Thread.sleep(10000);
		System.out.println("Login success");
}

}
