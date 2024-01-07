package RunnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/DragDrop.feature",plugin = { "pretty",

        "html:src/test/java/Reports/report1.html","json:src/test/java/Reports/report.json"},glue={"StepDefinationFile"},monochrome=true)
public class TestRunner {
}
