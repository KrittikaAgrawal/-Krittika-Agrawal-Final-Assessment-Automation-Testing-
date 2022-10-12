package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	// This is a program for Mouse Hover of mouse actions
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();//creating object of class
		   driver.get("http://www.aptransport.org/"); //getting web site
			Actions mouse=new Actions(driver);
			driver.manage().window().maximize(); //maximizing the screen
			mouse.moveToElement(driver.findElement(By.linkText("REGISTRATION"))).build().perform(); // Mouse hover action implemented
	}

}
