package SamplePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		RegPage reg = new RegPage(driver);
		
		reg.lnkRegister();
		reg.txtFirstName("aaa");
		reg.txtLastName("bbb");
		reg.txtAddress("ccc");
		reg.txtCity("ddd");
		reg.txtState("eee");
		reg.txtZipCode("0283");
		reg.txtPhone("1234567");
		reg.txtSsn("1234567890");
		reg.txtUsername("Sample6");
		reg.txtPassword("Sample6");
		reg.txtConfirm("Sample6");
		reg.btnRegister();
		
		if (reg.validateRegistration()) {
			
			reg.lnkLogout();
			LoginPage login = new LoginPage(driver);
			
			login.txtUsername("Sample6");
			login.txtPassword("Sample6");
			login.btnLogin();
		}
		
		System.out.println("Done");
	}

}
