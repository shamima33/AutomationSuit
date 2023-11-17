package Steps;

import Pages.BasePage;
import Pages.MyAccountPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RegistrationSteps  {
    MyAccountPage map;
public RegistrationSteps(){
    map  =new MyAccountPage();
}
    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
    map.open_chrome_browser();
    }
    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String string) {
    map.i_entered_valid_username("username");

    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String string) {
    map.i_entered_valid_emaill("email");

    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String string) {
    map.i_entered_valid_password("password");

    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
    map.i_click_registration_button();

    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {
        System.out.println( "I should be automatically redirected to the customer login page" );
    }

}





