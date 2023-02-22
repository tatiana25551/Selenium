package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* launch the browser
 * 2. navigate to amazon web site
 * 3. print out the title and the url in the console
 * 4. close the browser
 */
public class Class01 {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");

        String title= driver.getTitle();
        System.out.println("the title of the page is " +title);

        String URL =driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();

        
    }


}
