package proyecto_automatizacion.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Register {

    // se inspecciona la pagina, donde se utiliza siempre el TARGET de serenity para llamar las clases, id o xpath
    // se llaman despues en el task para su ejecucion en el orden que se desee

    public static final Target USER_FIELD = Target.the("ingreso de usuario").located(By.id("user-name"));
    public static final Target PASSWORD_FIELD = Target.the("ingreso de la contraseña").located(By.id("password"));
    public static final Target BTNLOGIN_FIELD = Target.the("boton de testing").located(By.id("login-button"));

}
