package co.com.testqa.stepdefinitions;

import co.com.testqa.models.CompraModel;
import co.com.testqa.questions.Answer;
import co.com.testqa.tasks.AbrirPagina;
import co.com.testqa.tasks.ComprarCelular;
import co.com.testqa.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class ComprarCelularStep {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Dado("^que (.*) quiere comprar un producto en la pagina demoblaze$")
    public void queQuiereComprarUnProductoEnLaPaginaDemoblaze(String nombre) {

        OnStage.theActorCalled(nombre).attemptsTo(AbrirPagina.demoBlaze());

    }

    @Cuando("^compra un celular$")
    public void compraUnCelular(List<CompraModel> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProducto.enPagina(datos.get(0).getProducto()));
        OnStage.theActorInTheSpotlight().attemptsTo(ComprarCelular.alFinalizar(datos.get(0)));
    }

    @Entonces("^se debe visualizar en pantalla (.*)$")
    public void seDebeVisualizarEnPantallaCompraExitosa(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
