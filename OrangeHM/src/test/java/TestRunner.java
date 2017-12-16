import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

/**
 * Created by SHRADHA on 01/08/2017.*/

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/OrangeHm/features/",
        tags ={"@smoke1"},
       // format = {"pretty:target/pretty-reports.pretty","html:target/html-reports.html", "json:target/json-reports.json"},
        dryRun = false,strict = true)

public class TestRunner {



}
