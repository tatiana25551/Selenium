package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagname {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");


        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        //get all links
        //we know that all links are in tag <a> which is also called anchor tag
        //lets use the locator by tagname for this purpose

        List<WebElement>tags=driver.findElements(By.tagName("a"));
        //in order to print
        //we need iterator

        for(WebElement tag:tags){
           tag.getAttribute("href");
           String link= tag.getAttribute("href");
            System.out.println(link);
        }


    }
}
