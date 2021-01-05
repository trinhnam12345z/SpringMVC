package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("message", "HELLOL HGO GFSJF");
        return "index";
    }

    @GetMapping(value = "/greeting")
    public  String greeting(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("name", name);
        return  "greeting";
    }
    @GetMapping(value = "/maytinh")
    public String maytinh(){
        return "maytinh";
    }
    @PostMapping(value = "/convert")
    public String maytinh(@RequestParam double number1 , @RequestParam double number2 ,@RequestParam String pheptinh , Model model){
        double result = number1 + number2;
        switch(pheptinh) {
            case "+":
                result = number1 + number2 ;
                break;
            case "-":
                result = number1 - number2 ;
                break;
            case "*":
                result = number1 * number2 ;
                break;
            case "/":
                result = number1 / number2 ;
                break;
        }
        model.addAttribute("number1",number1);
        model.addAttribute("number2",number2);
        model.addAttribute("result",result);
        return "maytinh";
    }


}