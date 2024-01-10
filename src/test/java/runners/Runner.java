package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/reports.html",
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = ""
)

public class Runner {
}
