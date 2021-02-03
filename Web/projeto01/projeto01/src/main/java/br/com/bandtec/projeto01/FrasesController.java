package br.com.bandtec.projeto01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController -> esta anotação transforma a classe em uma REST Controller
* isso é meta programação, nela sera possivel programar chamadas (ou EndPoint) para a API*/

@RestController
public class FrasesController {

    //a convenção de URI é kabbeb-case, ou seja, sem caracteres especiais


    /*@GetMapping -> esta anotação transforma o método numa chamada REST
     * URI: /
     * URL: "http://localhost:8080/"
     * */
    @GetMapping
    public String padrao(){
        return "API de Frases educadas";
    }


    /*@GetMapping -> esta anotação transforma o método numa chamada REST
    * URI: /bom-dia
    * URL: "http://localhost:8080/bom-dia"
    * */
    @GetMapping("/bom-dia")
    public String bomDia(){
        return "Bom dia, galera";
    }
    /* URI: /boa-tarde
    *  URL: "http://localhost:8080/boa-tarde"
    * */
    @GetMapping("/boa-tarde")
    public String boaTarde(){
        return "Boa tarde, amigos!";
    }
}
