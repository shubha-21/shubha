import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClassTest {
	public static WebDriver driver;
	//String Browser = "chrome";
	
	@Test
	public void LaunchBrowser() {
			System.setProperty("web.chrome.driver", "./src/main/resources/DriverFiles/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.goibibo.com/hotels/");
			driver.manage().window().maximize();
			driver.manage().window().getPosition();
			WebElement button =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			/*
			 * Point point = 100; driver.manage().window().setPosition(point);
			 */
			/*
			 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 * 
			 * WebDriverWait wait = new WebDriverWait(driver, 30); wait.unti TakesScreenshot
			 * ts = (TakesScreenshot)driver;
			 */
			//Select select = new Select(button);
			//select.deselectAll();
			Actions action = new Actions(driver);
			action.sendKeys("shubha");
			driver.switchTo().alert().accept();
			driver.switchTo();
			button.getScreenshotAs(OutputType.FILE);
			driver.switchTo();
			
		
	}
	
	
	/*
	 * @AfterClass public void BrowserBreakdown() throws InterruptedException {
	 * Thread.sleep(2000); driver.close(); }
	 */
	

}
