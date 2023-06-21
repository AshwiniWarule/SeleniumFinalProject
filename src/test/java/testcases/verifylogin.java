package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjectmodel.LoginPageObjectModel;
import resources.baseclass;
import resources.constant;

@Test
public class verifylogin extends baseclass {
    SoftAssert assertions = new SoftAssert();

    public void validLogin() throws IOException, InterruptedException {
        LoginPageObjectModel LPO = new LoginPageObjectModel(driver);

        LPO.myaccount().click();
        LPO.login().click();
        LPO.emaillogin().sendKeys(registertest.email);
        LPO.password().sendKeys(constant.password);
        LPO.loginclick().click();

        String A = LPO.validtext().getText();
        String B = "My Account";

        assertions.assertEquals(A, B, "fails with data");

        assertions.assertAll();
    }
}
