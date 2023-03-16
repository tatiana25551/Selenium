package HwClass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();


        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
//        enter the password
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement pimButton=driver.findElement(By.id("menu_pim_viewPimModule"));
        pimButton.click();

       List<WebElement>id = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));

       for (int i = 0; i < id.size(); i++) {
            String text = id.get(i).getText();
            if (text.equalsIgnoreCase("52393")) {
                System.out.println(text);
        System.out.println("The value of id is in row number " +(i + 1));

        driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+ (i + 1) +"]/td[1]")).click();


                    }
                }
            }
        }

