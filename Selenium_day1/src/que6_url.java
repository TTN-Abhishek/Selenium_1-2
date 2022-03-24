import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class que6_url {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tothenew.com/contact-us");	
		Thread.sleep(2000);
		driver.manage().window().maximize();

		String u = driver.getCurrentUrl();
		System.out.println("Url of the current page is " + u);		
		Thread.sleep(5000);
		driver.close();
	}
}
