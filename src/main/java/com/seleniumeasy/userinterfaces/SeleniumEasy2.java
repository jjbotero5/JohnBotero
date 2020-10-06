package com.seleniumeasy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleniumEasy2 {
  public static final Target TXT_SUCURSALRS =
      Target.the("txt").located(By.xpath("/html/body/div[1]/div[1]/div/h1"));
}
