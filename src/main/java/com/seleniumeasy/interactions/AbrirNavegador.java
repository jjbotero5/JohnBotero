package com.seleniumeasy.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Interaction {

  public static AbrirNavegador enSelenium() {
    return instrumented(AbrirNavegador.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"));
  }
}
