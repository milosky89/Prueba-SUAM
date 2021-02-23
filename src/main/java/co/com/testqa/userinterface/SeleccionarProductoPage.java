package co.com.testqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarProductoPage  {

    private static final String LOCATOR_PRODUCTO = "//a[contains(text(),'%s')]";
    private static final Target BTN_PRODUCTO = Target.the("Boton seleccionar producto").located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
    private static final Target BTN_ADDTOCAR = Target.the("Boton añadir producto").located(By.xpath("//a[contains(text(),'Add to cart')]"));

    public static Target btnProducto() {
        return BTN_PRODUCTO;
    }

    public static Target btnAddtocar() {
        return BTN_ADDTOCAR;
    }

    public static String locatorProducto() {
        return LOCATOR_PRODUCTO;
    }
}
