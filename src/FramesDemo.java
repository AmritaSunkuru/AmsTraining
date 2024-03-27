import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Amrita Nookala/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.switchTo().frame(0);
			WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
			WebElement tgt = driver.findElement(By.xpath("//div[@id='droppable']"));
			Actions a = new Actions(driver);
			a.dragAndDrop(src, tgt).build().perform();
			driver.switchTo().defaultContent();
			System.out.println("Added comment in AmsTraining project now from develop branch");
		
			

	}

}
