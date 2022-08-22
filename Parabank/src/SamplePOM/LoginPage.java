package SamplePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
        this.driver = driver;
	}
	
	By username = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//input[@value=\"Log In\"]");
	
	public void txtUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void txtPassword(String user) {
		driver.findElement(password).sendKeys(user);
	}

	public void btnLogin() {
		driver.findElement(login).click();
	}

}
