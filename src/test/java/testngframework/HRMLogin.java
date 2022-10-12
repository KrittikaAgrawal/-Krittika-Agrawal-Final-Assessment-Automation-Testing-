package testngframework;
import java.util.concurrent.TimeUnit;
//This is test class for Logging IN HRM
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class HRMLogin {
	private static WebDriver driver = null;
	  @Test
	  public void login() { //login test 
		  System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
			driver = new ChromeDriver(); //creating object of class
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//getting to website
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");//adding credentials
			driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type = 'submit']")).click(); //logging in
	  }
	  @Test
	  public void logout() { //log out test 
		  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		  driver.findElement(By.xpath("//ul/li[4]/a[@role='menuitem']")).click(); //logging out
	  }
}
