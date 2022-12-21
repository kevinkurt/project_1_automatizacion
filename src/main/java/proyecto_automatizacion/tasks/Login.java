package proyecto_automatizacion.tasks;

import proyecto_automatizacion.interactions.Wait;
import proyecto_automatizacion.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import proyecto_automatizacion.userinterface.Register;
import proyecto_automatizacion.utils.Datos;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
          //se llaman las variables para ingresar los valores, las variables se llaman de la carpeta UTILS
          // se utiliza el "ENTER.thevalue"+valor(variable)+localizador o ubicacion de la pagina

                    Enter.theValue(Datos.usuario).into(Register.USER_FIELD),
                    Enter.theValue(Datos.password).into(Register.PASSWORD_FIELD),
                    Click.on(Register.BTNLOGIN_FIELD),
        // se llama la clase WAIT para realizar espera de segundos solo agregandole segundos

                    Wait.theSeconds(5)




        );

            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static Login login () {
        return Tasks.instrumented(Login.class);
    }


}
