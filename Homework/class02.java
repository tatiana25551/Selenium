package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*HOMEWORK TIME:
HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser*/
public class class02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

      WebDriver driver=new ChromeDriver();
      driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

      driver.findElement(By.id("email")).sendKeys("tatiana");

       driver.findElement(By.name("pass")).sendKeys("abracadabra");

       driver.findElement(By.linkText("Register")).click();

       driver.quit();




    }
}
