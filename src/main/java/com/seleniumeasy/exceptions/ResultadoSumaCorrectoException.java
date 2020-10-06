package com.seleniumeasy.exceptions;

public class ResultadoSumaCorrectoException extends AssertionError {
  public static final String RESULTADO_INCORRECTO =
      "El resultado mostrado en pantalla no igual al resultado esperado";

  public ResultadoSumaCorrectoException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
