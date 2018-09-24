package Gmail;
import Setup.Drivers;
public class Runner extends Drivers{
	
	public static void main(String[] args) throws Exception
	{
		Setup.Drivers.init();
		Setup.Drivers.open_url("https://gmail.com");
		Gmail.Login.login("vishwanathmalakar","Uonly@G2014");
	    
	    while(true)
	    {
	    Gmail.Delete_page.select_delete();
	    Gmail.Uncheck.hasattachment();
	    Gmail.Delete_page.delete() ;
	}
	    
	}

}
	

	

