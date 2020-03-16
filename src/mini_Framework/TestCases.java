package mini_Framework;

import org.testng.annotations.Test;

public class TestCases extends UserLirary {
	
	@Test
	public static void TC01_ApplyLeave() throws InterruptedException {
		//Steps1 : Login as a team member
		LoginHRM("user02", "TM1234");
		//Step2 : Navigate to my leave
		navMyLeave();
		//Step3 : Enter details and click apply
		
		//Step4 : Logout from the app 
		LogoutHRM();
		
	}
	
    @Test
	public static void TC02_CancelLeave() throws InterruptedException {
    	//Steps1 : Login as a team member
    			LoginHRM("user02", "TM1234");
	}
    
    public static void TC03_SearchWitLeavehStatus() {
		
	}

}
