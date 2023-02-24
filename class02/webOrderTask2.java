package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask2 {
    public static void main(String[] args) {
        //tell your project where the webdriver is located


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //navigatre to website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //maximize
        driver.manage().window().maximize();

        //user name

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //cloick on login

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        driver.findElement(By.className("button")).click();

        //verify that title

        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct");
        }
        else {
            System.out.println("the title is incorrect");
        }

//        logout
        driver.findElement(By.linkText("Logout")).click();

//        close the browser
        driver.quit();

    }
}
