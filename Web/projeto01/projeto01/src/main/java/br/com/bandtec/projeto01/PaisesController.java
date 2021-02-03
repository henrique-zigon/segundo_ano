package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises") // todas as URI's a baixo tem a URI "/paises" na frente
                             //ou seja, todos os Endpoints são "/paises/..."
public class PaisesController {

    @GetMapping()// URI: /paises
    public String padrao(){
        return "Conheça os paises";
    }

    @GetMapping("/mexico")
    public String mexico(){
        return "Obrigado pelo Chaves";
    }

    @GetMapping("/cuba")
    public String cuba(){
        return "Melhores charrutos do mundo";
    }

    @GetMapping("/canada")
    public String canada(){
        return "Pedimos desculpa por qualquer coisa";
    }
}
