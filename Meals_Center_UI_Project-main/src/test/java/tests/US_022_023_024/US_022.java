
package tests.US_022_023_024;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.Assert.assertTrue;

public class US_022 extends TestBaseRapor {
    Actions actions;
    Merchant_Dashboard merchant;

    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    SoftAssert softAssert=new SoftAssert();


    @Test
    public void test01() {
        softAssert=new SoftAssert();

        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("namevisible", "namevisible2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");


        extentTest.info("Object created from Merchant_Dashboard class");

        softAssert.assertTrue(merchant_dashboard.merchantname.isDisplayed());

        extentTest.pass("Tested that the name is visible.");

        softAssert.assertAll();


    }

    @Test
    public void test02() {

        softAssert=new SoftAssert();

        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("nameclickable", "nameclickable2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password");

        ReusableMethods.waitForPageToLoad(5);

        softAssert.assertTrue(merchant_dashboard.merchantname.isEnabled());

        extentTest.pass("The accessibility of the name has been tested");

        merchant_dashboard.merchantname.click();

        extentTest.info("Click on name\n");

        softAssert.assertTrue(merchant_dashboard.profil.isDisplayed());

        extentTest.pass("The visibility of the profile has been tested.\n");

        softAssert.assertAll();


    }

    @Test
    public void test03() {

        //-Tarayıcı açılır.
        //
        //-"https://qa.mealscenter.com/backoffice/merchant/dashboard" adresine gidilir.
        //- Doğru mail ve password ile hesabıma giriş yapılır.
        //- İsmi tıklanıp dropdown menüden profil seçeneği tıklanır.
        //-Kendi profilime gittiğim doğrulanır.
        //- Tarayıcı kapatılır.
        merchant_dashboard = new Merchant_Dashboard();

        softAssert=new SoftAssert();

        extentTest = extentReports.createTest("go to profile", "go to profile2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");

        merchant_dashboard.merchantname.click();

        extentTest.info("Click on name");

        merchant_dashboard.profil.click();

        extentTest.info("click on profile");

        ReusableMethods.waitForPageToLoad(5);


        softAssert.assertTrue(merchant_dashboard.firstnamebox.isDisplayed());

        extentTest.pass("it is verified that i go to profile menu");

        softAssert.assertAll();


    }

    @Test
    public void test04() {


        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("go to profile", "go to profile2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.\n");

        merchant_dashboard.merchantname.click();

        extentTest.info("Click on name\n");

        merchant_dashboard.profil.click();

        extentTest.info("click on profile");

        softAssert.assertTrue(merchant_dashboard.BasicDetailsbox.isDisplayed());

        extentTest.info("Verifies that the BasicDetails box is visible");

        ReusableMethods.waitForVisibility(merchant_dashboard.firstnamebox, 3);

        merchant_dashboard.firstnamebox.sendKeys("mehmet");

        extentTest.info("The name is written in the firstname box.\n");

        merchant_dashboard.Lastnamebox.sendKeys("DAĞ");

        extentTest.info("Lastname is written in the Lastname box.\n");

        merchant_dashboard.Emailbox.sendKeys("");

        extentTest.info("An e-mail has been written to the e-mail box");

        merchant_dashboard.Contactnumber.sendKeys("1234567");

        extentTest.info("The number is entered in the ContactNumber box.");

        merchant_dashboard.Username.sendKeys("Efsane");

        extentTest.info("The name is written in the Username box.\n");

        merchant_dashboard.Savebox1.click();

        extentTest.info("Click the Save box.");

        softAssert.assertTrue(merchant_dashboard.Updateyazısı.isDisplayed());

        extentTest.pass("Tested that the change to my profile was made successfully.");

        softAssert.assertAll();


    }

    @Test(groups = "smoke")
    public void test05() {
        //-Change Password butonuna tıkladığımda ilgili sayfaya gittiğim doğrulanır.
        //-Old Password boxının görünür  ve clickable  olduğu doğrulanır.
        //-New Password görünür  ve clickable  olduğu doğrulanır.
        //-Confirm Password boxının görünür  ve clickable  olduğu doğrulanır.
        //-Save boxının görünür  ve clickable  olduğu doğrulanır.
        //- Tarayıcı kapatılır.

        SoftAssert softAssert = new SoftAssert();
        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("change Password", "change Password 2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");

        merchant_dashboard.merchantname.click();

        extentTest.info("Click on name");

        merchant_dashboard.profil.click();


        extentTest.info("click on profile");


        merchant_dashboard.ChangePasswordlinki.click();

        extentTest.info("Click the Change Password link");

        softAssert.assertTrue(merchant_dashboard.Oldpasswordbox.isEnabled());

        extentTest.pass("Verify that the oldpassword box is accessible");

        softAssert.assertTrue(merchant_dashboard.Newpasswordbox.isEnabled());

        extentTest.pass("Verify that the Newpassword box is accessible");

        softAssert.assertTrue(merchant_dashboard.Confirmpasswordbox.isEnabled());

        extentTest.pass("Verify that the Confirmpassword box is accessible");

        softAssert.assertTrue(merchant_dashboard.Savebox2.isEnabled());

        extentTest.pass("Verify that the save box is accessible");

        merchant_dashboard.Oldpasswordbox.sendKeys("1234567");

        merchant_dashboard.Newpasswordbox.sendKeys("12345678");

        merchant_dashboard.Confirmpasswordbox.sendKeys("12345678");

        ReusableMethods.wait(3);

        try {
            merchant_dashboard.Savebox2.click();
        } catch (Exception e) {
            softAssert.assertTrue(false, "SaveBox button is not working.");
        }


        //Save boxında bug var çalışmıyor.

        softAssert.assertAll();


    }


}




