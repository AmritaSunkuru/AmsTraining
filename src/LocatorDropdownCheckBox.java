import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorDropdownCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement dropdownObj = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select selectObj = new Select(dropdownObj);
		selectObj.selectByValue("AED");
		Thread.sleep(3000L);
		System.out.println("Selecting INR by value - "+selectObj.getFirstSelectedOption().getText());
		selectObj.selectByIndex(1);
		System.out.println("Selecting AED by index - "+selectObj.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		selectObj.selectByVisibleText("USD");
		System.out.println("Selecting USD by visibleText - "+selectObj.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		driver.close();
		driver.quit();

	}

}
