import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Q2 {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
	// WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();

	WebElement pss=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_2\"]"));
	pss.click();
	WebElement popup =driver.findElement(By.xpath("//*[@id=\"MultiCityModelAlert\"]"));
	popup.click();

	int count=0;
	int count1=0;

	String from="Delhi (DEL)";
	String to="Pune (PNQ)";
	
	WebElement wfrom= driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"));
	wfrom.click();
	wfrom.sendKeys("D");
	Thread.sleep(2000);
	List<WebElement> lfrom= driver.findElements(By.xpath("//*[@id=\"dropdownGroup1\"]//li"));
	
	for(WebElement el:lfrom){
		String current=el.getText();
		System.out.println(current);
		if(current.contains(from)){
			el.click();
			count++;
			break;
		}
	}
	if(count!=0){
		System.out.println("selected");
	}
	else{
		System.out.println("not seleted");
	}
	Thread.sleep(2000);
	
	WebElement wto = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]"));
	wto.click();
	wto.sendKeys("P");
	Thread.sleep(3000);
	List<WebElement> lto= driver.findElements(By.xpath("//*[@id=\"dropdownGroup1\"]//li"));

	for(WebElement el:lto){
		String current1=el.getText();
		System.out.println(current1);
		if(current1.contains(to)){
			el.click();
			count1++;
			break;
		}
	}
	if(count1!=0){
		System.out.println("selected");
	}
	else{
		System.out.println("not seleted");
	}
	Thread.sleep(2000);
	WebElement date=driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button"));
	date.click();
	Thread.sleep(3000);
	
	WebElement value =	driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[7]/div/select"));
	Select dropdown=new Select(value);
	Thread.sleep(3000);
	
	dropdown.selectByIndex(2);
	Thread.sleep(3000);
	
	dropdown.selectByValue("INR");
	Thread.sleep(3000);
	//dropdown.selectByVisibleText("USD");
	driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]")).click();
	Thread.sleep(4000);
	driver.close();	
	}
}