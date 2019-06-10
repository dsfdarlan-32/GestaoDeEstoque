package com.getaoDeEstoque.getaoDeEstoque.controlleres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FornecedorController {
  
  @RequestMapping("/cadastrarFornecedor")
  public String formFornecedor() {
    return "fornecedor/cadastrarFornecedor";
  }
}
