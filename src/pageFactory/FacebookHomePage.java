package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {
	WebDriver driver;
	@FindBy(css="#sideNav")
	WebElement loginNav;

	
	public FacebookHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	

	public void checkLoginSuccessful(){
		if(loginNav.isDisplayed())
			System.out.println("Successfully Logged In");
		else
			System.out.println("Login Attempt Failed.Check Again");
	}
}
