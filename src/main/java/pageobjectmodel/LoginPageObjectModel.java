package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjectModel {
	public WebDriver driver;

	private By myaccount = By.xpath("//span[contains(text(),'My Account')]");

	private By login = By.xpath("//a[contains(text(),'Login')]");

private By emaillogin=By.xpath("//input[@name='email']");

private By password=By.xpath("//input[@name='password']");

private By loginclick=By.xpath("//input[@value='Login']");

private By validtext=By.xpath("//h2[contains(text(),'My Account')]");


public LoginPageObjectModel(WebDriver driver) { 
	this.driver = driver;
}
public WebElement myaccount() {
	return driver.findElement(myaccount);
	
}
public WebElement login() {
	return driver.findElement(login);
	
}
public WebElement emaillogin() {
	return driver.findElement(emaillogin);
	
}
public WebElement password() {
	return driver.findElement(password);
	
}
public WebElement loginclick() {
	return driver.findElement(loginclick);
	
}
public WebElement validtext() {
	return driver.findElement(validtext);
	
}



}
