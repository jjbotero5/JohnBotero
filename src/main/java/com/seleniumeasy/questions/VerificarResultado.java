package com.seleniumeasy.questions;

import com.seleniumeasy.userinterfaces.SeleniumEasyPrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarResultado implements Question<Boolean> {

  private String resultado;

  public VerificarResultado(String resultado) {
    this.resultado = resultado;
  }

  public static VerificarResultado deLaSuma(String resultado) {
    return new VerificarResultado(resultado);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return Text.of(SeleniumEasyPrincipalPage.TXT_PDF).viewedBy(actor).asString().equals(resultado);
  }
}
