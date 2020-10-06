package com.seleniumeasy.tasks;

import static com.seleniumeasy.userinterfaces.SeleniumEasyPrincipalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.seleniumeasy.interactions.AbrirNavegador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class IngresarPractica implements Task {

  public IngresarPractica() {}

  public static IngresarPractica deSimpleForm() {
    return instrumented(IngresarPractica.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(AbrirNavegador.enSelenium());
  }
}
