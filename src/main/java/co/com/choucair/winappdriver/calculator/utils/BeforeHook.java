package co.com.choucair.winappdriver.calculator.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BeforeHook {
    @Before
    public void prepareStage() {
        WinAppDriver.open();
        AppSesion.setup();
        OnStage.setTheStage(new OnlineCast());
    }
}
