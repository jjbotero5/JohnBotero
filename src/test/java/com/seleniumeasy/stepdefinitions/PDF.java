package com.seleniumeasy.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.seleniumeasy.questions.VerificarResultado;
import com.seleniumeasy.tasks.IngresarBanistmo;
import com.seleniumeasy.tasks.IngresarPractica;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PDF {

  @Before
  public void prepararActor() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) ingreso a la pagina banistmo$")
  public void que_Camilo_ingreso_a_la_pagina_banistmo(String nombreActor) {
    theActorCalled(nombreActor).wasAbleTo(IngresarPractica.deSimpleForm());
  }

  @Cuando("^Busco el PDF$")
  public void busco_el_PDF() {
    theActorInTheSpotlight().attemptsTo(IngresarBanistmo.botones());
  }

  @Entonces("^Encuenta el PDF correcto (.*)$")
  public void encuenta_el_PDF_correcto(String resultado) {
    theActorInTheSpotlight()
        .should(seeThat(VerificarResultado.deLaSuma(String.valueOf(resultado))));
  }
}
