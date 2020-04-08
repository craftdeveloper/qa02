import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Endtoendtest {
	
	public WebDriver driver;
	
	@Test(priority = -1)
	public void start()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Brook\\OneDrive\\Desktop\\Selenium folder\\chromedriver_win32\\Chromedriver.exe");
		driver =new ChromeDriver();
	
	}
	@Test(priority =0)
	public void launchBrowser()
	{
		driver.get("https://facebook.com/");
			
			driver.manage().window().maximize();
		
		String expectedTitle = "Facebook - Log In or Sign Up";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
//		driver.findElement(By.xpath)("//*[value='Next']"));
//		
//		driver.findElement(By.id("pass"));password.clear()
		
		
		
		
		
		
	}

}
