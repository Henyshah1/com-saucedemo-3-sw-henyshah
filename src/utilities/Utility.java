package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    /**
     * method
     */
    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    /**
     * The method will get text from element
     */
    public String getTextElement(By by){
        return driver.findElement(by).getText();

    }
    /**
     * This method will have actions on mouseHover
     */
    public void mouseHoverOnElements(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
    public void sendTextToElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    public void selectByValueFromDropDown(By by, String value){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(value);
    }

    //select By index from Dropdown
    public void selectByIndexFromDown(By by, int index){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
    }


    public void clearTextToElement(By by){
        driver.findElement(by).clear();
    }

}

