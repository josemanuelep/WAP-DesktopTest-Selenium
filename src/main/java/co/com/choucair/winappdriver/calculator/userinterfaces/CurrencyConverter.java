package co.com.choucair.winappdriver.calculator.userinterfaces;


import co.com.choucair.winappdriver.calculator.utils.AppSesion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CurrencyConverter {
  public static  WebElement BUTTON_REFRESH_RATES = AppSesion.getSession().findElementByName("Actualizar tarifas");
  public static  WebElement COMBOBOX_INPUT_CURRENCY = AppSesion.getSession().findElementByName("Unidad de entrada");
  public static  WebElement COMBOBOX_OUTPUT_CURRENCY = AppSesion.getSession().findElementByName("Unidad de salida");
}
