package net.onlinenotepad.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UINotas {

    public static final Target BTN_TEXTO_ENRIQUECIDO = Target.the("Boton menu texto entriquecido").located(By.xpath("//button[contains(text(),'Nota de texto enriquecido')]"));
    public static final Target TXT_MENSAJE = Target.the("campo de texto mensaje").located(By.xpath("//div[@id='editor']"));
    public static final Target LBL_GUARDAR = Target.the("mensaje guardar").located(By.xpath("//body/div[2]/section[1]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/button[1]"));

}
