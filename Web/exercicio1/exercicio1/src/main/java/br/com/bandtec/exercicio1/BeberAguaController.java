package br.com.bandtec.exercicio1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beber-agua")
public class BeberAguaController {

    public Double litrosBebidos=0.0;
    public Integer vezes=0;

    @GetMapping("/{litros}")
    public void pegarLitros(@PathVariable Double litros){
        if (litros>0){
            this.litrosBebidos+=litros;
            this.vezes++;
        }
    }

    @GetMapping("/consultar")
    public String consultarLitros(){
        return "Você já bebeu água "+this.vezes + "vezes, totalizando "+this.litrosBebidos+" litros";
    }
}
