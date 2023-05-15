package net.onlinenotepad.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/texto_enriquecido.feature",
        glue = "net.onlinenotepad.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class notepad_runner {
}
