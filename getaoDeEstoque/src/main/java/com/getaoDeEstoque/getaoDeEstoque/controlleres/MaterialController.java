package com.getaoDeEstoque.getaoDeEstoque.controlleres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaterialController {
  
  @RequestMapping("/cadastrarMaterial")
  public String formMaterial() {
    return "material/cadastrarMaterial";
  }
}
