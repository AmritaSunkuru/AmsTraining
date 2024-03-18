import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndChildXpathToIgnoreIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:/Users/Amrita Nookala/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
            driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
            Thread.sleep(3000);
            List<WebElement> optionsList = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
            for(WebElement option : optionsList)
            {
            	System.out.println("Curretn option is - " +option.getText());
            	if (option.getText().equalsIgnoreCase("INDIA")) {
            		System.out.println("Going to click on the right option - " +option.getText());
            		option.click();
            		break;
            	}
            	
            }
            
            
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); --working
			//or
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			
			
			driver.close();
			driver.quit();
		
		}
}
