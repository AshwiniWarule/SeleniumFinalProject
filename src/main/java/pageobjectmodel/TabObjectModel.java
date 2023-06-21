package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabObjectModel {
	public WebDriver driver;
	private By desktopstab=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20'])[1]");

	private By textdsktp=By.xpath("//a[contains(text(),'PC (0)')]");
	
	private By laptopsandnotebook=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18'])[1]");
	
	private By laptop=By.xpath("//a[contains(text(),'Windows (0)')]");
	
	private By components=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25'])[1]");
	
	private By componenttext=By.xpath("//a[contains(text(),'Monitors (2)')]");
	
	
	private By tablets=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=57']");
	
	private By tablettext=By.xpath("(//a[contains(text(),'Tablets')])[2]");
	
	private By software=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=17']");
	
	private By Softwaretext=By.xpath("(//a[contains(text(),'Software')])[2]");
	
	private By phonesandPDAs=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=24']");
	
	private By phonetext=By.xpath("(//a[contains(text(),'Phones & PDAs')])[2]");
	
	private By cameras=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=33']");
	
	private By cameratext=By.xpath("(//a[contains(text(),'Cameras')])[2]");
	
	private By mp3player=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34']");

	private By mp3text=By.xpath("//a[contains(text(),'test 11 (0)')]");
	
	public TabObjectModel(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement desktopstab() {
		return driver.findElement(desktopstab);
		}
	public WebElement textdsktp() {
		return driver.findElement(textdsktp);
		}
	
	public WebElement components() {
		return driver.findElement(components);
		}
	
	public WebElement componenttext() {
		return driver.findElement(componenttext);
		}
	
	
	public WebElement tablets() {
		return driver.findElement(tablets);
		}
	public WebElement tablettext() {
		return driver.findElement(tablettext);
		}
	
	public WebElement software() {
		return driver.findElement(software);
		}
	public WebElement Softwaretext() {
		return driver.findElement(Softwaretext);
		}
	
	public WebElement phonesandPDAs() {
		return driver.findElement(phonesandPDAs);
		}
	
	public WebElement phonetext() {
		return driver.findElement(phonetext);
		}
	
	public WebElement cameras() {
		return driver.findElement(cameras);
		}
	public WebElement cameratext() {
		return driver.findElement(cameratext);
		}
	
	public WebElement mp3player() {
		return driver.findElement(mp3player);
		}
	public WebElement mp3text() {
		return driver.findElement(mp3text);
		}
	
	public WebElement laptopsandnotebook() {
		return driver.findElement(laptopsandnotebook);
		}
	public WebElement laptop() {
		return driver.findElement(laptop);
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
