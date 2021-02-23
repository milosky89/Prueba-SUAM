package co.com.testqa.stepdefinitions;

import co.com.testqa.questions.Answer;
import co.com.testqa.tasks.AbrirPagina;
import co.com.testqa.tasks.BtnAlerta;
import co.com.testqa.tasks.ComprarCelular;
import co.com.testqa.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ComprarCelularStep {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Dado("^que (.*) quiere buscar celulares en la pagina$")
    public void queCamiloQuiereBuscarCelularesEnLaPagina(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(AbrirPagina.deCompras(), (SeleccionarProducto.enPagina()));

    }

    @Cuando("^compra un celular$")
    public void compraUnCelular() {
        BtnAlerta.click();
        getDriver().switchTo().alert().accept();
        OnStage.theActorInTheSpotlight().attemptsTo(ComprarCelular.alFinalizar());
    }

    @Entonces("^se debe visualizar en pantalla (.*)$")
    public void seDebeVisualizarEnPantallaCompraExitosa(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
