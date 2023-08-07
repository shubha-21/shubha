

import java.awt.Robot;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class HomePageTest extends BaseClassTest{
	
		@Test
		public void FbLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		//LoginPage LP = new LoginPage (driver);
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			driver.findElement(By.id("downshift-1-input")).sendKeys("Nagpur");
			/*
			 * TakesScreenshot SC = (TakesScreenshot)driver; //File file
			 * =SC.getScreenshotAs(OutputType.FILE); //File d=new
			 * File("./Screenshot/"+".png");
			 */		}
		driver
		Robot robot = new Robot();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		
}
