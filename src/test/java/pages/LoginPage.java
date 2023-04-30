package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class LoginPage{
	
	WebDriver pageDriver;
	
	//============================ Objects ======================================
	
	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(name="user_login")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="rememberMe")
	WebElement rememberMe;
	
	@FindBy(name="btn_login")
	WebElement loginBtn;
	
	//============================ Methods ==============================================
	
	public LoginPage(WebDriver driver) {
		
		pageDriver = driver;
		PageFactory.initElements(pageDriver, this);
	}
	
	public void LoginFunction(String UserNameVal,String PwdVal) {
	
		loginLink.click();
		userName.sendKeys(UserNameVal);
		password.sendKeys(PwdVal);
		rememberMe.click();
		loginBtn.click();
		
	}

}





