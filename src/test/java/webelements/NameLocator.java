package webelements;
import java.util.concurrent.TimeUnit;
//This is program for webelements for logging in
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		// A. Elements present on Login page 
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //creating object of class
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //getting website
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin"); //adding credentials
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.linkText("Login")).click(); //submitting and we do not have name for Login button
	}

}
