package co.com.testqa.tasks;


import co.com.testqa.userinterface.ProductStorePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

 public class AbrirPagina implements Task {
     private ProductStorePage ProductStorePage;
     public static AbrirPagina deCompras() {
        return Tasks.instrumented(AbrirPagina.class);
    }

     @Override
     public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Open.browserOn(ProductStorePage));

    }
}
