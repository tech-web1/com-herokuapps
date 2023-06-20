package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        String baseurl="http://the-internet.herokuapp.com/login";

        //Launch the Chrome Browser
        WebDriver driver=new ChromeDriver();
        //open the Url into Browser
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
        WebElement userName=driver.findElement(By.name("name"));
        userName.sendKeys("ymca@gmail.com");

        //Type the password field and type the password
        driver.findElement(By.name("password")).sendKeys("ymca123");

        //Close The Browser
        driver.close();
    }
}
