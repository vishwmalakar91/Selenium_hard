package Gmail;
import Setup.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;

public class Delete_page extends Drivers{
	
	public static void select_delete()
	{
		d.findElement(By.xpath(".//div[@aria-label=\"Select\"]//span")).click();
		System.out.println("select all is clicked");
	}
	
	public static void delete() throws Exception
	{
	
		Thread.sleep(1000);
		try {
		d.findElement(By.xpath(".//div[@aria-label=\"Delete\"]")).click();
		}
		catch(ElementNotVisibleException E)
		{
			System.out.println("Cool, All Emails are deleted !");
			d.quit();
			System.exit(1);
		}
		System.out.println("email deleted");
		Thread.sleep(5000);
	}

}
