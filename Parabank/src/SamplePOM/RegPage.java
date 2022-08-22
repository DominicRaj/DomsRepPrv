package SamplePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {
	
	WebDriver driver;
	
	public RegPage(WebDriver driver) {
        this.driver = driver;
	}
	
	By reg = By.linkText("Register");
	By fName = By.id("customer.firstName");
	By lName = By.id("customer.lastName");
	By address = By.id("customer.address.street");
	By city = By.id("customer.address.city");
	By state = By.id("customer.address.state");
	By zipcode = By.id("customer.address.zipCode");
	By phone = By.id("customer.phoneNumber");
	By ssn = By.id("customer.ssn");
	By username = By.id("customer.username");
	By password = By.id("customer.password");
	By confirm = By.id("repeatedPassword");
	By register = By.xpath("//input[@value=\"Register\"]");
	By logout = By.linkText("Log Out");
	By message = By.xpath("//h1[@class=\"title\"]");
	
	public void txtFirstName(String user) {
		driver.findElement(fName).sendKeys(user);
	}
	
	public void txtLastName(String user) {
		driver.findElement(lName).sendKeys(user);
	}
	
	public void txtAddress(String user) {
		driver.findElement(address).sendKeys(user);
	}
	
	public void txtCity(String user) {
		driver.findElement(city).sendKeys(user);
	}
	
	public void txtState(String user) {
		driver.findElement(state).sendKeys(user);
	}
	
	public void txtZipCode(String user) {
		driver.findElement(zipcode).sendKeys(user);
	}
	
	public void txtPhone(String user) {
		driver.findElement(phone).sendKeys(user);
	}
	
	public void txtSsn(String user) {
		driver.findElement(ssn).sendKeys(user);
	}
	
	public void txtUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void txtPassword(String user) {
		driver.findElement(password).sendKeys(user);
	}
	
	public void txtConfirm(String user) {
		driver.findElement(confirm).sendKeys(user);
	}
	
	public void lnkRegister() {
		driver.findElement(reg).click();
	}
	
	public void lnkLogout() {
		driver.findElement(logout).click();
	}
	
	public void btnRegister() {
		driver.findElement(register).click();
	}
	
	public boolean validateRegistration() {
		if (driver.findElement(message).getText().contains("Welcome")) {
			System.out.println("Registration successful");
			return true;
		}
		else {
			System.out.println("Registration failed");
			return false;
		}
	}

}
