package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/"; //Store Url in variable

    @Before
    public void setUp() {

        //Opening Browser
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //Finding Element for username and sending text to username field
        sendTextToElement(By.id("user-name"), "standard_user");

        //Finding Element for password and sending text to password field
        sendTextToElement(By.name("password"), "secret_sauce");

        //Finding element to click on login button and perform click
        clickOnElement(By.name("login-button"));

        //Verifying the actual and expected text
        Assert.assertEquals("Invalid name", "Products",getTextElement(By.xpath("//span[contains(text(), 'Products')]")) );
    }


    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //Finding Element for username and sending text to username field
        sendTextToElement(By.id("user-name"), "standard_user");

        //Finding Element for password and sending text to password field
        sendTextToElement(By.name("password"), "secret_sauce");

        //Finding element to click on login button and perform click
        clickOnElement(By.name("login-button"));

        //List of images to check on webpage
        int xpathCount = driver.findElements(By.xpath("//div[@class='inventory_item_img']")).size();
        System.out.println("Total images are : " + xpathCount);

        List<WebElement> lst = driver.findElements(By.className("inventory_item_name"));
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getText());
        }
    }
    @After
    public void tearDown(){
        
        closeBrowser();
    }

}
