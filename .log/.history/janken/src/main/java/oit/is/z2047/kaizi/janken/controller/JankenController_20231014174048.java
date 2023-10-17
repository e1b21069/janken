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

  @GetMapping("/jankengcp/{param1}")
  public String jankengcp(@PathVariable String param1, ModelMap model) {
    int fist = Integer.parseInt(param1);// param1が文字列なので，parseIntでint型の数値に変換する

    // ModelMap型変数のmodelにtasuResult1という名前の変数で，tasuResultの値を登録する．
    // ここで値を登録するとthymeleafが受け取り，htmlで処理することができるようになる
    if (fist == 1) {
      return "jankengu.html";
    } else if(fist == 2) {
      return "jankencho.html";
    } else if(fist == 3) {
      return "jankenpa.html";
    }
    return "jankengu.html";

  }
}