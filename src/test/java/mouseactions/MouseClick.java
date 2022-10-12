package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {
	// This is a program for simple right and double click of mouse actions
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		//right click
		WebDriver driver = new ChromeDriver();//creating object of class
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//getting website
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	    driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin"); //logging in with credentials
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click(); //submitting
		Actions mouse=new Actions(driver);
		WebElement admin= driver.findElement(By.xpath("//span")); 
		mouse.contextClick(admin).build().perform();  //right click
		
		//double click
		WebDriver dr = new ChromeDriver();//creating object of class
        dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //getting website
        dr.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        dr.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin"); //logging in with credentials
		dr.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		dr.findElement(By.xpath("//button[@type = 'submit']")).click(); //submitting       
        WebElement adm= dr.findElement(By.xpath("//span"));
         Actions act = new Actions(dr);
         act.doubleClick(adm).build().perform(); //Double Click
	}

}
