package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\workspace 4\\AutomationRegistration\\src\\test\\resources\\Features\\Registration.feature"}, //NOTE: NO SPACE
        glue = {"Steps"},
        plugin = {
                "pretty",
                "html:build/reports/cucumber"
                ,"json:build/reports/cucumber-tests/test.json"}
)


public class TestRunner {
}
