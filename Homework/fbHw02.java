package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
[10:03 PM]
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clcikng on create new account
we will discuss "WHY" in future*/
public class fbHw02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

          driver.get("https://www.facebook.com/");

          driver.manage().window().maximize();

          driver.findElement(By.linkText("Create new account")).click();
          Thread.sleep(4000);

          driver.findElement(By.name("First name")).sendKeys("Tatiana");

          driver.findElement(By.name("Last name")).sendKeys("Fedorenco");

          driver.findElement(By.id("email")).sendKeys("t.fedorenco");

          driver.findElement(By.name("New password")).sendKeys("abracadabra");
          driver.findElement(By.className("Sign up")).click();

           driver.close();

           driver.quit();
    }
}
