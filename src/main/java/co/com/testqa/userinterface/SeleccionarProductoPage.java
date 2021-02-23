package co.com.testqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProductoPage extends PageObject {

    public static final Target BTN_PRODUCTO = Target.the("Boton seleccionar producto").located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
    public static final Target BTN_ADDTOCAR = Target.the("Boton añadir producto").located(By.xpath("//a[contains(text(),'Add to cart')]"));


}
