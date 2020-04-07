package co.com.choucair.winappdriver.calculator.utils;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppSesion {

    public static WindowsDriver CalculatorSession = null;

    public static WindowsDriver getSession() {
        return CalculatorSession;
    }

    public static void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            CalculatorSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            CalculatorSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

}