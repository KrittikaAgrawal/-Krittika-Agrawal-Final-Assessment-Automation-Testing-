package stepdefinations;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testngframework.MethodOverloadingSearch;
public class CucuExamples {
	private static WebDriver driver = null;
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
	}
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	
	@Given("user apply for leave")
	public void user_go_to_leave() {
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
	}
	@When("leave is applied by user")
	public void user_apply_leave() {
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25");
	}
	@Then("Leave Applied")
	public void leave_applied() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Given("User goes on Admin Page")
	public void user_go_to_admin() {
		driver.findElement(By.xpath("//a/span")).click();
	}
	@Then("User enters the fields")
	public void user_enter_details() {
		CucuExamples func= new CucuExamples();
		func.search("Admin");
		func.search("Admin","Paul Collings");
	}
	void search(String userName) 
		{
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		}
	void search(String userName, String empName) 
		{
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),userName);
			driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		}
}

