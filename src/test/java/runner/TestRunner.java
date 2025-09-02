package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Location.feature",
        glue = {"stepdefinitions"},
        plugin = {
            "pretty",
            "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
            "html:target/cucumber-reports.html"},
        monochrome = true
)
public class TestRunner {

}
