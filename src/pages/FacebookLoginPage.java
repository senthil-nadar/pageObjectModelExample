package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
	
	WebDriver driver;
	By userName=By.id("email");
	By userPassword=By.id("pass");
	By loginButton = By.id("loginbutton");
	By logOutLink = By.id("u_1a_5");
	
	public FacebookLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void setUserName(String strUserName){
		this.driver.findElement(userName).sendKeys(strUserName);
	}
	
	public void setUserPassword(String strUserPassword){
		this.driver.findElement(userPassword).sendKeys(strUserPassword);
	}
	
	public void clickLoginButton(){
		this.driver.findElement(loginButton).click();
	}
	
	
	public void loginFacebookPage(String strUserName, String strUserPassword){
		this.setUserName(strUserName);
		this.setUserPassword(strUserPassword);
		this.clickLoginButton();
		
	}

}
