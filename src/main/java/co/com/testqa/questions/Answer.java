package co.com.testqa.questions;

import co.com.testqa.userinterface.ComprarCelularPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String confirmarCompra= Text.of(ComprarCelularPage.CONFIRMACION).viewedBy(actor).asString();
        if ((question.equals(confirmarCompra))){
            result = true;
        }else  {
            result = false;
        }

        return result;
    }
}
