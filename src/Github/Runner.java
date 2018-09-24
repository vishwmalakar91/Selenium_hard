package Github;
import Setup.Drivers;;
public class Runner
{
	public static void main(String[] args) throws Exception 
	{
		Drivers.init();
		Drivers.open_url("https://github.com");
		Login.login("a","b");
	}

}
