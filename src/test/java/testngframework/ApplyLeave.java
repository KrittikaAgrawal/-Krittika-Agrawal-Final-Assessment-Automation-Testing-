package testngframework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ApplyLeave {
	private static WebDriver driver = null;
	  @Test
	  public void hrmleave() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			driver.findElement(By.linkText("Leave")).click();
			driver.findElement(By.linkText("Apply")).click();
			driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
			driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
			driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }
}
