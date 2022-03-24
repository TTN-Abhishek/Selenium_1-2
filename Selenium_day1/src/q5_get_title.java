import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class q5_get_title {
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
		
		driver.findElement(By.xpath("//a[@href='https://www.tothenew.com/contact-us']")).click();
		System.out.println("Task Executed");
		

		String t = driver.getTitle();
		System.out.println("Title is " + t);
		Thread.sleep(3000);
		
		driver.close();
	}
}
