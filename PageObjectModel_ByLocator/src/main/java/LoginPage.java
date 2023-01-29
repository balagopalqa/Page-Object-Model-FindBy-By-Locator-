import java.time.Duration;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	By username_TxtBox=By.name("username");
	
	By password_TxtBox=By.name("password");
	
	By submit_Button=By.xpath("//button[@type=\"submit\"]");
	
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void loginToApp(String un,String pwd) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(password_TxtBox));
		driver.findElement(username_TxtBox).sendKeys(un);;
		driver.findElement(password_TxtBox).sendKeys(pwd);;
        driver.findElement(submit_Button).click();;
		
	}
	

}
