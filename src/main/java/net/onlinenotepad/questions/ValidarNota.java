package net.onlinenotepad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.onlinenotepad.ui.UINotas.LBL_GUARDAR;

public class ValidarNota implements Question<Boolean> {

    public ValidarNota() {
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_GUARDAR.resolveFor(actor).isVisible();
    }

    public static ValidarNota enTexto(){
        return new ValidarNota();
    }
}
