package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL*/
public class HwXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        //enter the message in the text box
       WebElement id=driver.findElement(By.xpath("//input[contains(@id,'user-message')]"));
       id.sendKeys("Welcome March");

       //click on show message
       driver.findElement(By.xpath("//button[contains(@onclick,'showInput()')]")).click();

       //Enter value of a
       driver.findElement(By.xpath("//input[@placeholder='Enter value'][1]")).sendKeys("8");
       //Enter value of b
       driver.findElement(By.xpath("//input[@placeholder='Enter value'][2]")).sendKeys("14");
       //click on the button get total
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

        WebElement type=driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
        System.out.println(type.getAttribute("type"));


    }
}
