package Pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;
    public void open_chrome_browser(){


            String url="https://abc9262.sg-host.com/";
            System.setProperty(
                    "webdriver.chrome.driver",
                    "C:\\workspace 4\\AutomationRegistration\\chromedriver.exe");
// Instantiate a ChromeDriver class.driver = new ChromeDriver();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--headless");

            driver=new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println( "I am on the registration page" );
        }

    }


