package tests.US_009_025_026_027;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.User_Homepage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_009 extends TestBaseRapor {
    User_Homepage userHomepage=new User_Homepage();
    @Test
    public void tc0901privacypolicy(){
        extentTest = extentReports.createTest("privacypolicy  butonu gorunurlugu ve aktiflik testi",
                "privacypolicy butonu  gorunmeli ve tıklanmalı");
        ReusableMethods.goTouserHomePage();
        extentTest.info("homepage gidildi");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        Assert.assertTrue(userHomepage.privacypolicy.isDisplayed());
        extentTest.info("privacypolicy butonunun gorünürlüğü doğrulandı");
        ReusableMethods.wait(1);
        userHomepage.privacypolicy.click();
        extentTest.info("privacypolicy butonu tıklandı");
        Assert.assertTrue(userHomepage.privacypolicydogrulama.isDisplayed());
        extentTest.pass("privacypolicy sayfasına başarılı şekilde gidildiği doğrulandı");

    }
}
