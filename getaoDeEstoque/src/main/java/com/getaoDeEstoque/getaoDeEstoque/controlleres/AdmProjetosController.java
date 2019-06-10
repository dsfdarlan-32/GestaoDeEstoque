package com.getaoDeEstoque.getaoDeEstoque.controlleres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdmProjetosController {
  
  @RequestMapping("/AdmistrarProjetos")
  public String formMateriaisUtilizados() {
    return "AdmProjetos/AdmistrarProjetos";
  }
}
