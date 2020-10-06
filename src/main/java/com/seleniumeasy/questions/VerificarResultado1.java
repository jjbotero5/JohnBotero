package com.seleniumeasy.questions;

import com.seleniumeasy.userinterfaces.SeleniumEasy2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarResultado1 implements Question<Boolean> {

  private String resultado1;

  public VerificarResultado1(String resultado1) {
    this.resultado1 = resultado1;
  }

  public static VerificarResultado1 deLaSuma1(String resultado1) {
    return new VerificarResultado1(resultado1);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return Text.of(SeleniumEasy2.TXT_SUCURSALRS).viewedBy(actor).asString().equals(resultado1);
  }
}
