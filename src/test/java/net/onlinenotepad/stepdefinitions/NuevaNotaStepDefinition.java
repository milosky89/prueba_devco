package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import net.onlinenotepad.questions.ValidarNota;
import net.onlinenotepad.tasks.CrearNota;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NuevaNotaStepDefinition {


    @Dado("que {string} ingresa ala web {string}")
    public void queIngresaAlaWeb(String actor, String url) {
        theActorCalled(actor).attemptsTo(Open.url(url));
    }

    @Cuando("ingresa una nueva nota")
    public void ingresaUnaNuevaNota() {
        theActorInTheSpotlight().attemptsTo(CrearNota.enNegrilla());
    }
    @Entonces("debera poder guardar la nota")
    public void deberaPoderGuardarLaNota() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarNota.enTexto()));
    }


}
