package co.com.testqa.tasks;

import co.com.testqa.userinterface.SeleccionarProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {
    public static SeleccionarProducto enPagina() {
        return Tasks.instrumented(SeleccionarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SeleccionarProductoPage.BTN_PRODUCTO),
                         Click.on(SeleccionarProductoPage.BTN_ADDTOCAR)
        );

    }
}
