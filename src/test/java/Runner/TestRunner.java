package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\workspace 4\\AutomationRegistration\\src\\test\\resources\\Features\\Registration.feature"
        ,glue={"Steps"}
)


public class TestRunner {
}
