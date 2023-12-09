package SeleniumCommands;

import Utility.ApplicationUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AllSeleniumCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Trainings\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// wait statements
       // String gettitle = driver.getTitle();
        //System.out.println("title is " + gettitle);
       // String geturl = driver.getCurrentUrl();
        //System.out.println("url is " + geturl);
        //String getallpageifo = driver.getPageSource();
        //System.out.println(getallpageifo);
        String gettext = driver.findElement(By.xpath("//*[@id=\"top\"]/div/h1")).getText();
        System.out.println("text is " +gettext);
        //driver.findElement(By.xpath("//*[@id=\"btn-make-appointment\"]")).click();
        By mkeapt = By.xpath("//*[@id=\"btn-make-appointment\"]");
        ApplicationUtilities.clickelement(driver, mkeapt);
        ///driver.findElement(By.xpath("//*[@id=\"txt-username\"]")).sendKeys("John Doe");
        By username = By.xpath("//*[@id=\"txt-username\"]");
        ApplicationUtilities.Enetertext(driver,username,"John Doe");
        driver.findElement(By.xpath("//*[@id=\"txt-password\"]")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//*[@id=\"btn-login\"]")).click();
        //driver.quit();
        //driver.close();

    }

}
