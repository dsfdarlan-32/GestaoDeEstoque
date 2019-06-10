package com.getaoDeEstoque.getaoDeEstoque.controlleres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UnidadeController {
  
  @RequestMapping("/cadastrarUnidade")
  public String formUnidade() {
    return "fornecedor/cadastroUnidade";
  }
}
