package co.com.testqa.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarCelularPage extends PageObject {

    public static final Target BTN_CARRO = Target.the("Boton seleccionar producto").located(By.xpath("//a[@id='cartur']"));
    public static final Target BTN_PLACE_ORDER = Target.the("Boton seleccionar producto").located(By.xpath("//button[contains(text(),'Place Order')]"));
    public static final Target TXT_NAME = Target.the("Caja de texto nombre").located(By.xpath("//input[@id='name']"));
    public static final Target TXT_COUNTRY = Target.the("Caja de texto país").located(By.xpath("//input[@id='country']"));
    public static final Target TXT_CITY = Target.the("Caja de texto ciudad").located(By.xpath(" //input[@id='city']"));
    public static final Target TXT_CARD = Target.the("Caja de texto tarjeta de credito").located(By.xpath("//input[@id='card']"));
    public static final Target TXT_MONTH = Target.the("Caja de texto mes").located(By.xpath("//input[@id='month']"));
    public static final Target TXT_YEAR = Target.the("Caja de texto año").located(By.xpath("//input[@id='year']"));
    public static final Target BTN_COMPRAR = Target.the("Boton confirmar compra").located(By.xpath("//button[contains(text(),'Purchase')]"));
    public static final Target CONFIRMACION = Target.the("Mensaje de confirmacion compra").located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
}



