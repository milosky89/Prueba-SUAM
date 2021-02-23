package co.com.testqa.tasks;

import co.com.testqa.userinterface.ProductStorePage;
import co.com.testqa.userinterface.SeleccionarProductoPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


 @DefaultUrl("https://www.demoblaze.com/index.html")
 public class BtnAlerta implements Task  {
     private SeleccionarProductoPage SeleccionarProductoPage ;
     @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
     public WebElementFacade BtnAlerta;

     public static void click() {
     }

     @Override
     public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Open.browserOn(SeleccionarProductoPage));

     }
}



