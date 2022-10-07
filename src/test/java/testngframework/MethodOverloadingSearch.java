package testngframework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodOverloadingSearch {
	private static WebDriver driver = null;
  @Test
  public void loginsearch() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.findElement(By.linkText("Admin")).click();
		MethodOverloadingSearch func= new MethodOverloadingSearch();
		func.search("Admin");
		func.search("Admin","Paul Collings");
  }
  public void search(String userName) 
	{
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
  public void search(String userName, String empName) 
	{
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
}
