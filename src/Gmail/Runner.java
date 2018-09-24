package Gmail;
import Setup.Drivers;
public class Runner{
	
	public static void main(String[] args) throws Exception
	{
		Drivers.init();
		Drivers.open_url("https://gmail.com");
		Login.login("vishwanathmalakar","Uonly@G2014");
	    
	    while(true)
	    {
	    Delete_page.select_delete();
	    Uncheck.hasattachment();
	    Delete_page.delete() ;
	}
	    
	}

}
	

	

