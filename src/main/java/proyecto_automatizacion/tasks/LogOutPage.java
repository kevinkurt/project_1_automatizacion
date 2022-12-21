package proyecto_automatizacion.tasks;
import proyecto_automatizacion.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import proyecto_automatizacion.interactions.Wait;
import proyecto_automatizacion.userinterface.LogOut;


public class LogOutPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        try{

            actor.attemptsTo(

                    Click.on(LogOut.MENU_FIELD),
                    Click.on(LogOut.LOGOUT_FIELD),

                    // se llama la clase WAIT para realizar espera de segundos solo agregandole segundos

                    Wait.theSeconds(5)


            );

            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

        public static LogOutPage logOutPage (){
            return Tasks.instrumented(LogOutPage.class);
        }


    }



