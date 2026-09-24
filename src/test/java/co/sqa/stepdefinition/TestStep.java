package co.sqa.stepdefinition;

import co.sqa.questions.ValidarTexto;
import co.sqa.tasks.AgregarCarrito;
import co.sqa.tasks.SeleccionarElementoTasks;
import co.sqa.tasks.SeleccionarElementosTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.sqa.utils.Utilidades.Actor;
import static co.sqa.utils.Utilidades.Finalizar;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TestStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("selecciona un producto e ingresa dos cantidades")
    public void seleccionaUnProductoEIngresaDosCantidades() {
        OnStage.theActorCalled(Actor).attemptsTo(SeleccionarElementoTasks.choose());
    }

    @When("selecciona la opcion {string}")
    public void seleccionaLaOpcion(String string) {
        OnStage.theActorCalled(Actor).attemptsTo(AgregarCarrito.choose());
    }

    @Then("se visualizara el producto con la cantidad")
    public void seVisualizaraElProductoConLaCantidad() {
        theActorInTheSpotlight().should(seeThat(ValidarTexto.witchParams(Finalizar)));
    }
    @Then("se visualizara los productos con las cantidad")
    public void seVisualizaraLosProductosConLasCantidad() {
        theActorInTheSpotlight().should(seeThat(ValidarTexto.witchParams(Finalizar)));
    }


    @And("selecciona dos producto e ingresa {int} cantidades")
    public void seleccionaDosProductoEIngresaCantidades(Integer int1) {
        OnStage.theActorCalled(Actor).attemptsTo(SeleccionarElementosTask.choose());
    }
}
