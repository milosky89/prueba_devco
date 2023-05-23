package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.onlinenotepad.ui.UINotas.*;
import static net.onlinenotepad.util.TextoAleatorio.mensajeAleatorio;

public class CrearNota implements Task {

    private String mensaje = mensajeAleatorio();

    public CrearNota() { }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_TEXTO_ENRIQUECIDO),
                Click.on(BTN_NEGRILLA),
                Enter.theValue(mensaje).into(TXT_MENSAJE)
                );
    }
    public static CrearNota enNegrilla ( ){
        return Tasks.instrumented(CrearNota.class);
    }

}
