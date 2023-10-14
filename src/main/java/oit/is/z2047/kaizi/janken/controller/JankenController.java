package oit.is.z2047.kaizi.janken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {
  @PostMapping("/janken1")
  public String janken1(@RequestParam("username") String name, ModelMap model) {
    model.addAttribute("username", name);
    return "janken.html";
  }

  
  @GetMapping("/janken1")
  public String janken2() {
    return "janken.html";
  }
}
