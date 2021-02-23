package co.com.testqa.tasks;

import co.com.testqa.models.CompraModel;
import co.com.testqa.userinterface.ComprarCelularPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ComprarCelular implements Task {
     private CompraModel datos;

     public  ComprarCelular(CompraModel datos){
         this.datos = datos;
     }

    public static ComprarCelular alFinalizar(CompraModel datos){
        return Tasks.instrumented(ComprarCelular.class,datos);
    }

     @Override
     public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(WaitUntil.the(ComprarCelularPage.btnCarro(), WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(ComprarCelularPage.btnCarro()),
                    Click.on(ComprarCelularPage.btnPlaceOrder()),
                    Enter.theValue(datos.getNombre()).into(ComprarCelularPage.txtName()),
                    Enter.theValue(datos.getPais()).into(ComprarCelularPage.txtCountry()),
                    Enter.theValue(datos.getCiudad()).into(ComprarCelularPage.txtCity()),
                    Enter.theValue(datos.getTarjeta()).into(ComprarCelularPage.txtCard()),
                    Enter.theValue(datos.getMes()).into(ComprarCelularPage.txtMonth()),
                    Enter.theValue(datos.getAno()).into(ComprarCelularPage.txtYear()),
                    Click.on(ComprarCelularPage.btnComprar())
        );
    }
}
