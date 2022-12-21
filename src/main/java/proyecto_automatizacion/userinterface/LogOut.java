package proyecto_automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogOut {

    public static final Target MENU_FIELD = Target.the("salir de la sesion").located(By.id("react-burger-menu-btn"));

    public static final Target LOGOUT_FIELD = Target.the("salir de la sesion").located(By.id("logout_sidebar_link"));

}
