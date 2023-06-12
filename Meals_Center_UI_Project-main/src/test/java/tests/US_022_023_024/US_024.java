package tests.US_022_023_024;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class US_024 extends TestBaseRapor {
    Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

    SoftAssert softAssert=new SoftAssert();

    Actions actions;

    @Test

    public void test01() {

        softAssert=new SoftAssert();

        merchant_dashboard = new Merchant_Dashboard();

        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("go to profile", "go to profile 2");

        ReusableMethods.merchantLogin();

        extentTest.info("\n" +
                "Login with username and password");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("The Food Button was pressed.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Button was pressed.");

        softAssert.assertTrue(merchant_dashboard.CategoryListYazısı.isDisplayed());

        extentTest.pass("It is verified that I go to the Category Page.");

        softAssert.assertAll();


    }

    @Test
    public void test02() {


        softAssert=new SoftAssert();
        merchant_dashboard = new Merchant_Dashboard();

        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("go to profile", "go to profile2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("The Food Button was pressed.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Button was pressed.");

        softAssert.assertTrue(merchant_dashboard.CategoryListYazısı.isDisplayed());

        extentTest.pass("It is verified that I go to the Category Page.");

        softAssert.assertTrue(merchant_dashboard.SignatureRoll.isEnabled());

        extentTest.pass("Accessibility of Signature Roll category tested");

        softAssert.assertTrue(merchant_dashboard.MakiandclassicRoll.isEnabled());

        extentTest.pass("Accessibility of MakiandclassicRoll category tested");

        softAssert.assertTrue(merchant_dashboard.Sushibox.isEnabled());

        extentTest.pass("Accessibility of the Sushibox category tested");

        softAssert.assertTrue(merchant_dashboard.PickedForYou.isEnabled());

        extentTest.pass("Accessibility of the PickedForYou category tested");

        softAssert.assertAll();


    }

    @Test (groups = "smoke")
    public void test03() {
        softAssert=new SoftAssert();
        merchant_dashboard = new Merchant_Dashboard();

        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("add to category", "add to category 2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("The Food Button was pressed.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Button was pressed.");

        merchant_dashboard.AddNewButonu.click();


        extentTest.info("AddNew Button was pressed.");

        merchant_dashboard.NameBox.sendKeys("mehmet");

        extentTest.info("The name was written in the Name box. Thus, its accessibility was also tested.");

        merchant_dashboard.Descriptionbox.sendKeys("Bu menü çok lezzetlidir.");

        extentTest.info("A definition was written in the Description box. Thus, its accessibility was also tested.");

        merchant_dashboard.Browsebox1.click();

        extentTest.info("Click on Browse1 box.");

        ReusableMethods.waitForPageToLoad(5);

        merchant_dashboard.FeaturedImage.click();

        extentTest.info("An image has been selected for FeaturedImage.");

        ReusableMethods.wait(2);

        merchant_dashboard.AddFilesButonu.click();

        extentTest.info("AddFiles button clicked");

        ReusableMethods.wait(3);

        merchant_dashboard.Browsebox2.click();

        extentTest.info("clicked on browse2 box");

        ReusableMethods.waitForVisibility(merchant_dashboard.IconImage, 5);

        merchant_dashboard.IconImage.click();

        extentTest.info("An image has been selected for IconImage.");

        merchant_dashboard.AddFiles2.click();

        extentTest.info("AddFiles2 button clicked");

        ReusableMethods.waitForVisibility(merchant_dashboard.DishBox, 3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.wait(2);

        merchant_dashboard.DishBox.click();

        actions.sendKeys(Keys.ENTER).perform();


        extentTest.info("Meal option is selected for Dish Box.");

        Select select = new Select(merchant_dashboard.StatusBox);

        select.selectByVisibleText("Draft");


        extentTest.info("A selection has been made for the status box.");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.wait(1);

        merchant_dashboard.Savebox.click();

        extentTest.info("The changes made are saved.");

        softAssert.assertTrue(merchant_dashboard.SuccesfullyCreatedYazısı.isDisplayed());

        extentTest.pass("Tested that changes were made successfully.");

        softAssert.assertAll();


    }

    @Test
    public void test04() {
        merchant_dashboard = new Merchant_Dashboard();
        softAssert=new SoftAssert();

        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("update", "update2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");

        merchant_dashboard.FoodButonu.click();

        extentTest.info("The Food Button was pressed.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Button was pressed.");

        merchant_dashboard.UpdateButonu.click();

        extentTest.info("The update button has been pressed.");


        softAssert.assertTrue(merchant_dashboard.DetailsBox.isDisplayed());

        extentTest.pass("Confirmed I'm on the update page.");

        merchant_dashboard.NameBox.sendKeys("mehmet2");

        extentTest.info("The name was written in the Name box. Thus, its accessibility was also tested.");

        merchant_dashboard.Descriptionbox.sendKeys("  Bu menü çok lezzetlidir.");

        extentTest.info("A definition was written in the Description box. Thus, its accessibility was also tested.");

        merchant_dashboard.Browsebox1.click();

        extentTest.info("Click on Browse1 box.");

        ReusableMethods.waitForPageToLoad(5);

        merchant_dashboard.UpdateFeaturedImage.click();

        extentTest.info(" An image has been selected for the Update FeaturedImage.");

        ReusableMethods.wait(2);

        merchant_dashboard.AddFilesButonu.click();

        extentTest.info("AddFiles button clicked");


        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.wait(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.wait(3);

        merchant_dashboard.Savebox.click();

        extentTest.info("The changes made are saved.");

        softAssert.assertTrue(merchant_dashboard.UpdatedYazısı.isDisplayed());

        extentTest.pass("Tested that changes were made successfully.");

        softAssert.assertAll();


    }


    @Test
    public void test05() {

        softAssert=new SoftAssert();

        merchant_dashboard = new Merchant_Dashboard();

        extentTest = extentReports.createTest("go to profile", "go to profile2");

        ReusableMethods.merchantLogin();

        extentTest.info("Login with username and password.");


        merchant_dashboard.FoodButonu.click();

        extentTest.info("The Food Button was pressed.");

        merchant_dashboard.CategoryButonu.click();

        extentTest.info("Category Button was pressed.");

        String SilinmedenÖnce=merchant_dashboard.EntryYazısı.getText();

        merchant_dashboard.DeleteButonu.click();

        extentTest.info("Delete Button Has Been Pressed.");

        merchant_dashboard.DeleteConfirmation.click();

        extentTest.info("Delete operation Confirmed.");




        String SilindiktenSonra=merchant_dashboard.EntryYazısı.getText();

        System.out.println(SilinmedenÖnce);

        System.out.println(SilindiktenSonra);


softAssert.assertAll();



    }


}
