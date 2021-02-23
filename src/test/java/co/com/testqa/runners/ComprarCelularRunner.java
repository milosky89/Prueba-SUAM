package co.com.testqa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compra_celular.feature",
        tags = "@Compras",
        glue = "co.com.testqa",
        snippets = SnippetType.CAMELCASE)


public class ComprarCelularRunner {
}
