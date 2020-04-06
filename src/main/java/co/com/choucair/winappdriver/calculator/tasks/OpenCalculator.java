package co.com.choucair.winappdriver.calculator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.choucair.winappdriver.calculator.userinterfaces.CaculatorPage.BUTTON_CLEAR;
import static co.com.choucair.winappdriver.calculator.userinterfaces.CalculatorLeftBar.*;
import static co.com.choucair.winappdriver.calculator.userinterfaces.CurrencyConverter.BUTTON_REFRESH_RATES;

public class OpenCalculator implements Task {
    private static String funtion;

    public static OpenCalculator standart() {
        funtion = "standart";
        return Tasks.instrumented(OpenCalculator.class);
    }

    public static OpenCalculator currencyConverter() {
        funtion = "currency";
        return Tasks.instrumented(OpenCalculator.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//        switch (funtion) {
//            case "standart":
//                BUTTON_TOGGLE_LEFT_PANE.click();
//                BUTTON_STANDART_CALCULATOR.click();
//                BUTTON_CLEAR.click();
//            case "currency":
//                BUTTON_TOGGLE_LEFT_PANE.click();
//                BUTTON_CURRENCY_CALCULATOR.click();
//                BUTTON_REFRESH_RATES.click();
//                BUTTON_CLEAR.click();
//        }
    }
}
