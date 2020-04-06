package co.com.choucair.winappdriver.calculator.userinterfaces;

import co.com.choucair.winappdriver.calculator.utils.AppSesion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorLeftBar {
    public static final WebElement BUTTON_CLEAR = AppSesion.getSession().findElementByName("Quitar entrada");
    public static final WebElement BUTTON_TOGGLE_LEFT_PANE = AppSesion.getSession().findElementByAccessibilityId("TogglePaneButton");
//    public static final WebElement BUTTON_STANDART_CALCULATOR = AppSesion.getSession().findElementByAccessibilityId("Standard");
//    public static final WebElement BUTTON_CURRENCY_CALCULATOR = AppSesion.getSession().findElementByAccessibilityId("Currency");

}

