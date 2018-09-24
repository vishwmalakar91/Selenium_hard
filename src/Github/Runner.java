package Github;
import Setup.Drivers;;
public class Runner extends Drivers
{
	public static void main(String[] args) throws Exception 
	{
		Drivers.init();
		d.get("https://github.com");
		Github.Login.login("a","b");
	}

}
