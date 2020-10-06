package com.seleniumeasy.tasks;

import static com.seleniumeasy.userinterfaces.SeleniumEasyPrincipalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresarBanistmo1 implements Task {
  public static IngresarBanistmo botones1() {
    return instrumented(IngresarBanistmo.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Click.on(BTN_PRODUCTOS),
        Click.on(BTN_TRANSFEINTER),
        WaitUntil.the(BTN_SUCURSALES, isVisible()).forNoMoreThan(20).seconds(),
        Click.on(BTN_SUCURSALES));
  }
}
