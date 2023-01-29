
public class LoginTest {

	public static void main(String[] args) {
		 DriverFactory drv= new DriverFactory();
		 drv.init_driver("chrome");
	     LoginPage	 login=new LoginPage(DriverFactory.getDriver());
		 login.loginToApp("Admin", "admin123");
	}
}
