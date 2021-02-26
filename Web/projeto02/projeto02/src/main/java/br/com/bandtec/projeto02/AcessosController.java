package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acessos")
public class AcessosController {

    /*
        O Spring Boot cria 1 instancia da Controller(ou seja um Singleton)
        Por tanto, muito cuidade no uso de atributo de instancia!
    */
    private int acessos=0;

    @GetMapping("/contar")
    public String contarAcessos(){
        acessos++;
        return "Você já acessou a API "+acessos+" vezes";
    }


}
