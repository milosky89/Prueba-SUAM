package co.com.testqa.tasks;

import co.com.testqa.userinterface.SeleccionarProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {
    private String producto;

    public SeleccionarProducto(String producto){
        this.producto = producto;
    }

    public static SeleccionarProducto enPagina(String producto) {
        return Tasks.instrumented(SeleccionarProducto.class,producto);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(String.format(SeleccionarProductoPage.locatorProducto(),producto)),
                         Click.on(SeleccionarProductoPage.btnAddtocar())
        );

    }
}
