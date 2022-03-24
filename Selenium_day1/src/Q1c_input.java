import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1c_input {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\geckodriver-v0.30.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		Thread.sleep(2000);
		
		WebElement alert1 = driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]"));
		alert1.click();

		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("My Name Is Abhishek");
		
		Thread.sleep(1000);
		driver.quit();
	}
}

