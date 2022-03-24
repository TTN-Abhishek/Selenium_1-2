import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que4a_navigate_contact_xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");	
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		WebElement searchBox= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchBox.sendKeys("http://www.tothenew.com/");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Site searched");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
		Thread.sleep(2000);
		System.out.println("Task Executed");
		Thread.sleep(5000);
		driver.close();
	}
}
