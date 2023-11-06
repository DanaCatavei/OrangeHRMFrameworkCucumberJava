package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import stepsDefinition.Hook;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\_DANA\\QA Engineer\\IdeaProjects\\SauceDemoFrameworkCucumberJava\\src\\test\\resources\\features",
        glue = "stepsDefinition",
        monochrome = true)
public class Runner extends Hook {
    @AfterClass
    public static void afterClass(){
        driver.quit();
    }
}
