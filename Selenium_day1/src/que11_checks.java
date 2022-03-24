import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que11_checks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");	
		Thread.sleep(2000);
		

		WebElement searchBox = driver.findElement(By.xpath("//button[@id='Button1']\r\n"));
		System.out.println("Refresh Button is enabled : " + searchBox.isEnabled());
		
		WebElement gender = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]"));
		System.out.println("Gender button selected as male true/fales : " + gender.isEnabled());
		
		WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]"));
		String head = header.getText();
		System.out.println("Header of the page is : " + head);
		
		String t = driver.getTitle();
		System.out.println("Title is " + t);
		
		Thread.sleep(10000);
		driver.close();
	}
}
