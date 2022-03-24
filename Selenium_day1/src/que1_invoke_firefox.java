import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class que1_invoke_firefox {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\geckodriver-v0.30.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");	
		Thread.sleep(10000);
		driver.close();
	}
}
