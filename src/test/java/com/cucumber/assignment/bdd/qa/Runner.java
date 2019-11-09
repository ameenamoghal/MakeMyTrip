package com.cucumber.assignment.bdd.qa;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", dryRun = false, strict=true, tags="@booking",
                 plugin = {"json:src/test/java/TripJson.json",
                           "html:src/test/java/CucReport.html",
                           "pretty"} )
public class Runner
{

}
