package StepDefinations;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",glue={"StepDefinations"},
monochrome = true,
plugin = {"pretty","html:target/Reports/htmlreport.html"})


public class testRunner {

}
