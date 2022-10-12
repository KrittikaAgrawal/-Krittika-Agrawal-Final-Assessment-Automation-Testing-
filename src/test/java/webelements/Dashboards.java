package webelements;
import java.util.concurrent.TimeUnit;
//This is program for webelements on dashboard
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dashboards {
	public static void main(String[] args) {
		// B. Elements present on Dashboards 
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //creating object of class
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //getting website
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin"); //adding credentials
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click(); //submitting
		// B. Elements present on Dashboards- we do not have names and ID for fields on dashboard.
		
		//B. Elements present on Dashboard using xpath
		driver.findElement(By.xpath("//li/a/span")).click();
		driver.findElement(By.xpath("//li[2]/a/span")).click();
		driver.findElement(By.xpath("//li[3]/a/span")).click();
		driver.findElement(By.xpath("//li[4]/a/span")).click();
		
		//B. Elements present on Dashboard using LinkText
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Time")).click();
	}

}
