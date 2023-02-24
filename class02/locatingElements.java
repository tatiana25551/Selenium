package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[]args){
        //tell your project where the webdriver is located


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");


        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
      //open the website fb
        driver.get("https://www.facebook.com/");

        //send in the username

        driver.findElement(By.id("email")).sendKeys("tatiana");

        //send the password

        driver.findElement(By.name("pass")).sendKeys("abracdabra");

        //click on the button create account
        driver.findElement(By.linkText("Create new account")).click();

        //click on forgotten password
     driver.findElement(By.partialLinkText("password/")).click();
     driver.quit();

        }

    }

