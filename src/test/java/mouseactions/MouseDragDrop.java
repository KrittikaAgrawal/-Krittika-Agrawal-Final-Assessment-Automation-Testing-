package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseDragDrop {
	// This is a program for drag and drop of mouse actions
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //creating object of class
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");//getting website
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggable']")); //finding elements to drag by xpath
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']")); //finding elements to drop by xpath
		act.dragAndDrop(drag, drop).build().perform(); //performing drag and drop operation
	}

}
