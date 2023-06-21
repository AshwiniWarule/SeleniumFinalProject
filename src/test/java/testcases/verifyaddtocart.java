package testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.ah.A;

import pageobjectmodel.addcart;
import resources.baseclass;
import resources.constant;

@Test
public class verifyaddtocart extends baseclass{
	  SoftAssert assertions = new SoftAssert();
double sum;
	public void addcart1() throws IOException, InterruptedException {
	addcart AC=new addcart(driver) ;
		AC.search().sendKeys(constant.mob);	
		AC.clickbutton().click();
		AC.addtocartiphone().click();
		String A=AC.iphoneprice().getText();
		String New=A.substring(1, 7);
		double NUM=Double.parseDouble(New);
		
		AC.search().clear();
		
		AC.search().sendKeys(constant.samsung);
		AC.clickbutton().click();
		AC.addtocartsamsung().click();
		String B=AC.samsungprice().getText();
		String New1=B.substring(1, 7);
		double NUM1=Double.parseDouble(New1);
		
		sum=NUM+NUM1;
		
		Thread.sleep(2000);
		AC.totalcart().click();
		String totalsum=AC.totalsum().getText();
		String sub=totalsum.substring(13,19);
    	double sm=Double.parseDouble(sub);
    	
    	Double act=sum;
    	Double exp=sm;
    	double tolerance = 0.000;
    	if(act.equals(exp)) {
    		System.out.println("pass");                    //
    	}
    	else {
    		System.out.println("fail");                      //
    	}
    	
    	assertions.assertNotEquals(sm, sm, tolerance); 
	}
}

	