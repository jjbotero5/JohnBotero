package com.seleniumeasy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleniumEasyPrincipalPage {
  public static final Target BTN_PRODUCTOS =
      Target.the("Boton productos")
          .located(By.xpath("//a[contains(text(),'Productos & Servicios')]"));
  public static final Target BTN_TRANSFEINTER =
      Target.the("Boton docuemenbtos asociados")
          .located(By.xpath("//a[contains(text(),'Transferencias Internacionales')]"));
  public static final Target BTN_DOCASOCIA =
      Target.the("Boton docuemenbtos asociados")
          .located(By.xpath("//*[@id=\"filialTabs\"]/li[3]/a"));
  public static final Target TXT_PDF =
      Target.the("Texto del pdf")
          .located(By.xpath("//*[@id=\"tab3\"]/table/tbody/tr[1]/td[1]/span"));

  public static final Target BTN_SUCURSALES =
      Target.the("btn")
          .located(
              By.xpath(
                  "//body/div[@id='main-content']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]"));

  private SeleniumEasyPrincipalPage() {}
}
