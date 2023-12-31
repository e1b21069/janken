package oit.is.z2047.kaizi.janken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class JankenController {
  @RequestMapping("name")
  @GetMapping("/janken1")
  public String janken1(@RequestParam String userName, ModelMap model) {
    model.addAttribute("name", userName);
    return "janken.html";
  }
}
