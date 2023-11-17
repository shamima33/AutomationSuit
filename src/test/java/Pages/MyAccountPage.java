package Pages;

import org.openqa.selenium.By;

public class MyAccountPage  extends BasePage{
    public void i_entered_valid_username(String un) {
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys("Jon5D66oe123");
        System.out.println( "I enter a valid Username " );
    }

    public void i_entered_valid_emaill(String em) {
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("jo5hn66oe@example.com");
        System.out.println( "I enter a valid Email address " );
    }

    public void i_entered_valid_password(String ps) {
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("joho567e@example.com");
        System.out.println( "I enter a valid Password " );
    }

    public void i_click_registration_button() {
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click
                ();
        System.out.println( "I submit the registration form" );

    }
}