import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selIntroduction {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//Chrome Driver
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Amrita Nookala/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(1000);
		//driver.get("https://rahulshettyacademy.com");
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		//System.out.println(driver.getTitle());// working
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.findElement(By.linkText("Login")).click();
	//		Login working
	//	driver.findElement(By.xpath("//a[@class='theme-btn']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("amrita.sunkuru@gmail.com");
		
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot Password")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	
		//Firefox Driver
		//using geckodriver
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Amrita Nookala/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
	}

}
