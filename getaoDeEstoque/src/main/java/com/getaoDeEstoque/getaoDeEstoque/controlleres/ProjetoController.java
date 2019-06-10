package com.getaoDeEstoque.getaoDeEstoque.controlleres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjetoController {
  
  @RequestMapping("/cadastrarProjeto")
  public String formCadastrarProjeto() {
    return "projeto/cadastrarProjeto";
  }
    
}
