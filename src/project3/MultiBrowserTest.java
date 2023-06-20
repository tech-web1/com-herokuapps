package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser="Edge";

    static String baseurl="http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver=new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the Title of the page
        String title=driver.getTitle();
        System.out.println("Page Title is"+title);
        //Print the current url
        System.out.println("Current URL"+driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source"+driver.getPageSource());

        //Find the username Field Element
        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("ymca@gmail.com");

        //Type the password field and type the password
        driver.findElement(By.name("password")).sendKeys("ymca123");

        //Close The Browser
        driver.close();

    }
}
