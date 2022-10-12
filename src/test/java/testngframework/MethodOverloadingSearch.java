package testngframework;
import java.util.concurrent.TimeUnit;
//This is test class for Method Overloading for Search Operation
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodOverloadingSearch {
	private static WebDriver driver = null;
  @Test
  public void loginsearch() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		driver = new ChromeDriver(); //creating object of class
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//getting to website
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");//adding credentials
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.findElement(By.linkText("Admin")).click(); //clicking on admin page
		MethodOverloadingSearch func= new MethodOverloadingSearch();
		func.search("Admin"); // method-1
		func.search("Admin","Paul Collings");// method-2 Method- overloading 
  }
  public void search(String userName) //function defination for searching based on username
	{
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
  public void search(String userName, String empName) //function defination for searching based on username and empname
	{
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
}
