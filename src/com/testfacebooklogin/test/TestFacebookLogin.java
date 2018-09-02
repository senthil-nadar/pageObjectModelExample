package com.testfacebooklogin.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FacebookHomePage;
import pages.FacebookLoginPage;


public class TestFacebookLogin {
	WebDriver driver;
	DesiredCapabilities capabilities;
	FacebookLoginPage pageModelLoginPage;
	FacebookHomePage pageModelHomePage;

	@BeforeSuite
	@Parameters({"browserName"})
	public void browserSetUp(String browserName){
		if(browserName.equalsIgnoreCase("internetexplorer")){
		System.setProperty("webdriver.ie.driver","C:\\seleniumDrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\seleniumDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	

	
    @AfterSuite
    public void terminateBrowser(){
        driver.quit();
    }
	
    /*
    //below 2 tests are written using simple programming techniques
	@Test(priority=1)
	public void loginFacebookPage() throws InterruptedException, IOException {
		WebElement emailEle= driver.findElement(By.id("email"));
		emailEle.sendKeys("realusername");
		WebElement  passEle= driver.findElement(By.id("pass"));
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(enabled=true,priority = 2)
	public void checkLoginSuccessful(){
		WebDriverWait wait=new WebDriverWait(driver, 20);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//WebElement foundElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userNav")));
		driver.navigate().to("https://www.facebook.com");
		WebElement foundElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sideNav")));
		//Assert.assertTrue(foundElement!=null);
	}
	*/
    
    @Test(priority = 1)
    public void loginFacebookPage(){
    	pageModelLoginPage=new FacebookLoginPage(driver);
    	pageModelLoginPage.loginFacebookPage("realusername", "realpassword");
    }
    
    @Test(priority = 2)
    public void checkLoginSuccessful(){
    	pageModelHomePage=new FacebookHomePage(driver);
    	pageModelHomePage.checkLoginSuccessful();
    }
}
