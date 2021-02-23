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
         return question.equals(Text.of(ComprarCelularPage.CONFIRMACION()).viewedBy(actor).asString());
    }
}
