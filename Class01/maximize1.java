package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize1 {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create instance of wedri
        WebDriver driver=new ChromeDriver();

        //go to google.com
        driver.get("https://www.google.com/");
        //maximize the window

        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        driver.close();

    }
}
