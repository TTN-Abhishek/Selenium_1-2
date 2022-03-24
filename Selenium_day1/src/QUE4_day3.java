import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class QUE4_day3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		int j=0;
		String[] itemsNeeded= {"Cucumber","Brocolli", "Beetroot","Tomato","Cauliflower", "Beans", "Brinjal", "Capsicum","Potato", "Onion"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		List<WebElement> products =
				driver.findElements(By.cssSelector("h4.product-name"));
		//Finding add to cart value using index i in list of "add to carts"(30 in thissite).
		for(int i=0; i< products.size();i++)
		{ //Brocolli - 1Kg
			String[] name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				//Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// break; we can not use break with arrayList.
				if(j==10)
					break;
			}
		}
		driver.close();
	}
}