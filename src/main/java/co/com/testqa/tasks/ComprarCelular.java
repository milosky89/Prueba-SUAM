package co.com.testqa.tasks;

import co.com.testqa.userinterface.ComprarCelularPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

 public class ComprarCelular implements Task {
    private ComprarCelularPage comprarcelularPage;
    public static ComprarCelular alFinalizar(){
        return Tasks.instrumented(ComprarCelular.class);
    }

     @Override
     public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Click.on(ComprarCelularPage.BTN_CARRO),
                    Click.on(ComprarCelularPage.BTN_PLACE_ORDER),
                    Enter.theValue("Camilo").into(ComprarCelularPage.TXT_NAME),
                    Enter.theValue("Colombia").into(ComprarCelularPage.TXT_COUNTRY),
                    Enter.theValue("Medellin").into(ComprarCelularPage.TXT_CITY),
                    Enter.theValue("ABC123").into(ComprarCelularPage.TXT_CARD),
                    Enter.theValue("05").into(ComprarCelularPage.TXT_MONTH),
                    Enter.theValue("22").into(ComprarCelularPage.TXT_YEAR),
                    Click.on(ComprarCelularPage.BTN_COMPRAR)
        );
    }
}
