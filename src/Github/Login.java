package Github;

import org.openqa.selenium.By;
import Setup.Drivers;

public class Login extends Drivers{
	public static void login(String email,String password) throws Exception
{
		d.findElement(By.xpath(".//a[@href=\"/login\"]")).click();
}

}
