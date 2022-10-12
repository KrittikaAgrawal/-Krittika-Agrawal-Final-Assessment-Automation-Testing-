package stepdefinations;
import java.util.concurrent.TimeUnit;
//This is class defination for feature file- cucumber
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CucuExamples {
	private static WebDriver driver = null;
	//This is given condition for browser opening
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //getting website
	}
	//This is a when condition for logging in using credentials
	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin"); //sending credentials to login 
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
	}
	//This is a then condition for login in
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click(); //logging in by submitting 
	}
	//This is given condition for applying leave
	@Given("user apply for leave")
	public void user_go_to_leave() {
		driver.findElement(By.linkText("Leave")).click(); //clicking on leave
		driver.findElement(By.linkText("Apply")).click(); //clicking on apply
	}
	//This is a when condition for applying leave
	@When("leave is applied by user")
	public void user_apply_leave() {
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click(); //applying leave using these details
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25");
	}
	//This is a the condition for successful applying of leave
	@Then("Leave Applied")
	public void leave_applied() {
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //apply button click for applying leave
	}
	//This is given condition for going to admin page and search for employees
	@Given("User goes on Admin Page")
	public void user_go_to_admin() {
		driver.findElement(By.xpath("//a/span")).click(); //clicking on admin page
	}
	//This is then condition for searching for employees
	@Then("User enters the fields")
	public void user_enter_details() {
		CucuExamples func= new CucuExamples(); //creating object of class
		func.search("Admin"); //method1 
		func.search("Admin","Paul Collings"); //method2- Method overloading
	}
	void search(String userName)  //function defination for searching based on username
		{
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		}
	void search(String userName, String empName) //function defination for searching based on username and empname
		{
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),userName);
			driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		}
}

