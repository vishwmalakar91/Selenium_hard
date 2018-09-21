package Gamil;

public class Delete_mails extends Drivers{
	
	public static void main(String[] args) throws Exception
	{
		Gamil.Drivers.init();
		Gamil.Drivers.open_url("https://gmail.com");
	    Gamil.Login.login("vishwanathmalakar","Uonly@G2014");
	    
	    while(true)
	    {
	    Gamil.Delete_page.select_delete();
	    Gamil.Uncheck.hasattachment();
	    Gamil.Delete_page.delete() ;
	}
	    
	}

}
	

	

