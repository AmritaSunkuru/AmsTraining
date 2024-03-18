import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Amrita Nookala/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).click());
		System.out.println("follwoing-sibling example "+driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		System.out.println("parent example "+driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
		
		driver.close();
		driver.quit();
		
		
		
	}

}
