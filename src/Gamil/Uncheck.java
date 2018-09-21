package Gamil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Uncheck extends Drivers {
	
	public static void hasattachment()throws Exception
	{
		Thread.sleep(1000);
		List<WebElement> atc=d.findElements(By.xpath(".//img[@alt=\"Has attachment\"]//ancestor::tr[1]//td[1]"));
		System.out.println("number of attachment rows = "+atc.size());
		int atc_size=atc.size();
		while(atc_size>0)
		{
			d.findElement(By.xpath("(.//img[@alt=\"Has attachment\"]//ancestor::tr[1]//td[2])["+atc_size+"]")).click();
			atc_size--;
		}
	}
	
	public static void hasimp()throws Exception
	{
		Thread.sleep(1000);
		List<WebElement> imp=d.findElements(By.xpath(".//div[contains(@aria-label,\"Important\")]"));
		int imp_size=imp.size();
		System.out.println(imp_size);
		while(imp_size>0)
		{
			System.out.println("number of imp rows = "+imp_size);
			d.findElement(By.xpath("(.//div[contains(@aria-label,\"Important\")]//ancestor::tr[1]//td[2])["+imp_size+"]")).click();
			imp_size--;
			Thread.sleep(1000);
		}
	}

}
