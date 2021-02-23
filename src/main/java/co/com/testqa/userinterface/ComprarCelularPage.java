package co.com.testqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarCelularPage {

    private static final Target BTN_CARRO = Target.the("Boton seleccionar producto").located(By.xpath("//a[@id='cartur']"));
    private static final Target BTN_PLACE_ORDER = Target.the("Boton seleccionar producto").located(By.xpath("//button[contains(text(),'Place Order')]"));
    private static final Target TXT_NAME = Target.the("Caja de texto nombre").located(By.xpath("//input[@id='name']"));
    private static final Target TXT_COUNTRY = Target.the("Caja de texto país").located(By.xpath("//input[@id='country']"));
    private static final Target TXT_CITY = Target.the("Caja de texto ciudad").located(By.xpath(" //input[@id='city']"));
    private static final Target TXT_CARD = Target.the("Caja de texto tarjeta de credito").located(By.xpath("//input[@id='card']"));
    private static final Target TXT_MONTH = Target.the("Caja de texto mes").located(By.xpath("//input[@id='month']"));
    private static final Target TXT_YEAR = Target.the("Caja de texto año").located(By.xpath("//input[@id='year']"));
    private static final Target BTN_COMPRAR = Target.the("Boton confirmar compra").located(By.xpath("//button[contains(text(),'Purchase')]"));
    private static final Target CONFIRMACION = Target.the("Mensaje de confirmacion compra").located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));

    public static Target btnCarro() {
        return BTN_CARRO;
    }

    public static Target btnPlaceOrder() {
        return BTN_PLACE_ORDER;
    }

    public static Target txtName() {
        return TXT_NAME;
    }

    public static Target txtCountry() {
        return TXT_COUNTRY;
    }

    public static Target txtCity() {
        return TXT_CITY;
    }

    public static Target txtCard() {
        return TXT_CARD;
    }

    public static Target txtMonth() {
        return TXT_MONTH;
    }

    public static Target txtYear() {
        return TXT_YEAR;
    }

    public static Target btnComprar() {
        return BTN_COMPRAR;
    }

    public static Target CONFIRMACION() {
        return CONFIRMACION;
    }
}



