package PageObjectClass;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Initializing WebElements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements((SearchContext) this, driver);
	}
    
	@FindBy (xpath ="\"(//input[@type='radio'])[1]\"") private WebElement India;
	
}

