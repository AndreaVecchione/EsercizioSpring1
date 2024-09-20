package com.example.EsercizioSpring1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping ("/ciao")
    public String saluto(@RequestParam (value = "nome") String nome, @RequestParam(value = "Milano") String milano) {
        return "Ciao" + nome + ", com'è il tempo in" + milano + "?";
    }
}
