package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		//right click
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click(); 
		Actions mouse=new Actions(driver);
		WebElement admin= driver.findElement(By.xpath("//span"));
		mouse.contextClick(admin).build().perform();  //right click
		
		//double click
		WebDriver dr = new ChromeDriver();
        dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
        dr.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        dr.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		dr.findElement(By.xpath("//button[@type = 'submit']")).click();          
        WebElement adm= dr.findElement(By.xpath("//span"));
         Actions act = new Actions(dr);
         act.doubleClick(adm).build().perform();              //Double Click
	}

}
