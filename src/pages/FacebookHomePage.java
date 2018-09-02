package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookHomePage {

	WebDriver driver;
	By loginNav=By.cssSelector("#sideNav");
	
	public FacebookHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	public void checkLoginSuccessful(){
	if(this.driver.findElement(loginNav).isDisplayed())
		System.out.println("Successfully Logged In");
	else
		System.out.println("Login Attempt Failed.Check Again");
}
}
