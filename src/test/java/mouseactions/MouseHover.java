package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://www.aptransport.org/");
			Actions mouse=new Actions(driver);
			driver.manage().window().maximize();
			mouse.moveToElement(driver.findElement(By.linkText("REGISTRATION"))).build().perform();
			Thread.sleep(1000);
	}

}
