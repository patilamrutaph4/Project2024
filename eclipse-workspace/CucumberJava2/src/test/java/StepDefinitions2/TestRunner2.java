package StepDefinitions2;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions2"},monochrome=true,
plugin= {"pretty","html:target/htmlreports"},
tags="@smokefeature")

public class TestRunner2 {

}
