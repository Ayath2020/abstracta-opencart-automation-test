package us.abstracta.opencart.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\Features\\CarritoCompras.feature",
        glue = "us.abstracta.opencart.StepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@add_to_cart",
        plugin = "pretty"
)
public class Runner {
}
