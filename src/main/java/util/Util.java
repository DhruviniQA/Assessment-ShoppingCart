package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {


    public static void scrollDown(WebDriver driver){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }
    

    public static void scrollToElementview(WebDriver driver,WebElement element){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }
   
    public static void clickElement(WebDriver driver,WebElement element){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	System.out.println(driver.toString());
        jse.executeScript("arguments[0].click();", element);
    }
   
    public static void setValue(WebDriver driver,WebElement element, String v1){
       	JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].setAttribute('value', '5.5')", element);
        jse.executeScript("arguments[0].setAttribute('aria-valuenow', '5.5')", element);

    }


    public static void scrollToTop(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript(
                    "document.querySelector(" + element + ").scrollTop=1000");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void scrollTop2(WebDriver driver, String id) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript(
                    "document.getElementById(" + id + ").scrollTop=1000");
        } catch (Exception e) {
            e.getMessage();
        }
    }







}
