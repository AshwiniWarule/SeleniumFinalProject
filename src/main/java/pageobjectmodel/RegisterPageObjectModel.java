package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RegisterPageObjectModel {
	public WebDriver driver;

	private By myaccount = By.xpath("//span[contains(text(),'My Account')]");

	private By register = By.xpath("//a[contains(text(),'Register')]");

	private By firstname = By.xpath("//input[@name='firstname']");

	private By lastname = By.xpath("//input[@name='lastname']");

	private By email = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password = By.xpath("//input[@name='password']");

	private By passwordconfirm = By.xpath("//input[@name='confirm']");

	private By agreecheckbox = By.xpath("//input[@name='agree']");

	private By continuebotton = By.xpath("//input[@value='Continue']");

	private By validtext=By.xpath("//p[contains(text(),'Congratulations! Your new account has been successfully created!')]");
	
	public RegisterPageObjectModel(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement myaccount() {
		return driver.findElement(myaccount);
	}

	public WebElement ragister() {
		return driver.findElement(register);
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}

	public WebElement lastname() {
		return driver.findElement(lastname);
	}

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement telephone() {
		return driver.findElement(telephone);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement passwordconfirm() {
		return driver.findElement(passwordconfirm);
	}

	public WebElement agreecheckbox() {
		return driver.findElement(agreecheckbox);
	}

	public WebElement continuebotton() {
		return driver.findElement(continuebotton);
	}
	
	public WebElement validtext() {
		return driver.findElement(validtext);
	}
	
	

}
