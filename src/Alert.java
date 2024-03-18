import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webriver.chrome.driver", "C:/Users/Amrita Nookala/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Amy");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println("Text on Alert - "+ driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//ALERT
		System.out.println("Added one extra line for GIT demo");
		System.out.println("Added one extra line for GIT demo");

	}

}
