package pageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	
	WebDriver driver;
	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(id="pass")
	WebElement userPassword;
	
	@FindBy(id="loginbutton")
	WebElement loginButton;
	
	@FindBy(id="u_1a_5")
	WebElement logOutLink;
	
	public FacebookLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUserName){
		userName.sendKeys(strUserName);
	}
	
	public void setUserPassword(String strUserPassword){
		userPassword.sendKeys(strUserPassword);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}
	
	
	public void loginFacebookPage(String strUserName, String strUserPassword){
		this.setUserName(strUserName);
		this.setUserPassword(strUserPassword);
		this.clickLoginButton();
		
	}

}
