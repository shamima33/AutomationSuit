package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\workspace 4\\AutomationRegistration\\src\\test\\java\\Runner\\TestRunner.java",
        glue={"Steps"},
        plugin = {"json:target/cucumber.json"})





public class TestRunner {
}
