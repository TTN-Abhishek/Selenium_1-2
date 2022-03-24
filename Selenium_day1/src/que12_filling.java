import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que12_filling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");	
		Thread.sleep(2000);
		

		WebElement fname = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]") );
		fname.click();
		fname.sendKeys("Abhishek");
		
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input") );
		lname.click();
		lname.sendKeys("Kumar");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input") );
		email.click();
		email.sendKeys("abhishek@gmail.com");
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
