package FIT.FIT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import FIT.FIT.services.IMCService;

/* CONTROLLER PRINCIPAL */
@RestController
@RequestMapping("/")
public class IMCController {
  /* IMC SERVICE - REALIZARÁ O CÁLCULO DO IMC */
  @Autowired
  private IMCService imcsvc;

  /* CALCULAR_IMC - IRÁ CHAMAR O SERVICE DO IMC PARA RETORNAR O CÁLCULO */
  @GetMapping("/")
  public String calcularIMCController() {
    return imcsvc.calcularIMCService();
  }
}
