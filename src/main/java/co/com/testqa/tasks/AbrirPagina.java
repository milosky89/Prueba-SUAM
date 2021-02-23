package co.com.testqa.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

 public class AbrirPagina implements Task {

     public static AbrirPagina demoBlaze() {
        return Tasks.instrumented(AbrirPagina.class);
    }

     @Override
     public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Open.url("https://www.demoblaze.com/index.html"));

    }
}
