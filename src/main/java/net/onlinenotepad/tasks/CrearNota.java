package net.onlinenotepad.tasks;

import net.onlinenotepad.models.NotaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.onlinenotepad.ui.UINotas.*;

public class CrearNota implements Task {

    NotaModel notamodel;

    public CrearNota(NotaModel notamodel) {
        this.notamodel = notamodel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_TEXTO_ENRIQUECIDO),
                Enter.theValue(notamodel.getNota()).into(TXT_MENSAJE)
                );

    }
    public static CrearNota enNegrilla ( NotaModel notamodel){
        return Tasks.instrumented(CrearNota.class, notamodel);
    }

}
