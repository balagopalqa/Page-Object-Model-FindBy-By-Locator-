import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {
		System.out.println("browser value is: "+browser);
		
		if(browser.equals("chrome")) {
            tldriver.set(new ChromeDriver());
		}
		else if (browser.equals("firefox")) {
			tldriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please pass the correct browser value: "+browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}

}
