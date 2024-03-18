import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonaddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//optional below code as we now have Se Manager
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Amrita Nookala/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> productsList = driver.findElements(By.xpath("//h4[@class='product-name']"));

		String[] itemsNeeded = {"Beetroot","Beans","Mango","Musk Melon"};
		//converting from Array to Array list, so that we can use contains to verify the text
		List<String> itemsListNeeded = Arrays.asList(itemsNeeded);
		int counter =0;
		//for(WebElement product : productsList)
		for(int i=0; i<productsList.size();i++)
		{
			
			//if(productsList.get(i).getText().contains("Cucumber")) {
			String[] splittedProductListArr = productsList.get(i).getText().split("-");

			if(itemsListNeeded.contains(splittedProductListArr[0].trim())) 
			{
				//driver.findElement(By.xpath("(//div[@class='product-action']/button)["+(i+1)+"]")).click();
				//or
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println("Added to cart - "+splittedProductListArr[0].trim());
				counter++;
				if(counter==itemsListNeeded.size()) {
					System.out.println("Coming out of the loop now at i = " +i);
					break;
				}
			}
		
		}
		driver.close();
		driver.quit();
	}
}

