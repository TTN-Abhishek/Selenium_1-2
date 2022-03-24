import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class que2_invoke_IE {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(10000);
		driver.close();
	}
}
