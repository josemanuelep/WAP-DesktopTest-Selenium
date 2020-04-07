package co.com.choucair.winappdriver.calculator.userinterfaces;

import co.com.choucair.winappdriver.calculator.utils.AppSesion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorLeftBar {
    public static final WebElement BUTTON_CLEAR = AppSesion.getSession().findElementByName("Quitar entrada");
    public static final WebElement BUTTON_TOGGLE_LEFT_PANE = AppSesion.getSession().findElementByName("Abrir navegación");
    public static final WebElement BUTTON_STANDART_CALCULATOR = AppSesion.getSession().findElementByName("Estándar Calculadora");
    public static final WebElement BUTTON_CURRENCY_CALCULATOR = AppSesion.getSession().findElementByName("Divisa Convertidor");

}

