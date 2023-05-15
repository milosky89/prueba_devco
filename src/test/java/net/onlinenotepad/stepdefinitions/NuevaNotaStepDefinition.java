package net.onlinenotepad.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.onlinenotepad.models.NotaModel;
import net.onlinenotepad.questions.ValidarNota;
import net.onlinenotepad.tasks.CrearNota;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import javax.xml.crypto.Data;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NuevaNotaStepDefinition {


    @Dado("que {string} ingresa ala web {string}")
    public void queIngresaAlaWeb(String actor, String url) {
        theActorCalled(actor).attemptsTo(Open.url(url));
    }
    @Cuando("ingresa una nueva nota")
    public void ingresaUnaNuevaNota(DataTable data) {
        theActorInTheSpotlight().attemptsTo(CrearNota.enNegrilla(NotaModel.setData(data).get(0)));
    }
    @Entonces("debera poder guardar la nota")
    public void deberaPoderGuardarLaNota() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarNota.enTexto()));
    }


}
