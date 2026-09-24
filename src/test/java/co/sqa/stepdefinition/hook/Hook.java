package co.sqa.stepdefinition.hook;

import co.sqa.hook.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.sqa.utils.Time.waiting;
import static co.sqa.utils.Utilidades.TIME_SHORT;
import static co.sqa.utils.Utilidades.TITULO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} ingresa el sitio web")
    public void ingresaElSitioWeb(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.broserURL());
        waiting(TIME_SHORT);

        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITULO)
                )
        );
    }
}
