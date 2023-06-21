package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addcart {
	public WebDriver driver;

	private By search=By.xpath("//input[@name='search']");
	
	private By clickbutton=By.xpath("(//button[@type='button'])[4]");
	
	private By addtocartiphone =By.xpath("(//button[@type='button'])[9]");
	
	private By addtocartsamsung =By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span");

	private By totalcart=By.xpath("//div[@id='cart']");
	
	private By totalsum=By.xpath("//*[@id=\"cart-total\"]");
	
	private By iphoneprice=By.xpath("//p[contains(text(),'$123.20')]");
	
	private By samsungprice=By.xpath("//p[contains(text(),'$241.99')]");
	
	public addcart(WebDriver driver) { 
		this.driver = driver;
	}
	
public WebElement search() {
	return driver.findElement(search);
	
}
public WebElement clickbutton() {
	return driver.findElement(clickbutton);
	
}
public WebElement addtocartiphone() {
	return driver.findElement(addtocartiphone);
	
}
public WebElement addtocartsamsung() {
	return driver.findElement(addtocartsamsung);
	
}

public WebElement totalcart() {
	return driver.findElement(totalcart);
	
}
public WebElement totalsum() {
	return driver.findElement(totalsum);
	
}
public WebElement iphoneprice() {
	return driver.findElement(iphoneprice);
	
}
public WebElement samsungprice() {
	return driver.findElement(samsungprice);
	
}




}
