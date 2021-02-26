package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alimentacao")
public class AlimentacaoController {

    @GetMapping
    public String padrao(){
        return "API com guia de alimentação péssima";
    }


    /*
        {frutas} -> é um path param, que é substituido pelo parametro 'frutas'
        porque:
        1- O nome é igual;
        2- O parâmetro está anotado com @PathVariable
    */
    @GetMapping("/frutas-dia/{frutas}")
    public String analisarConsumoFrutas(@PathVariable int frutas){
        if(frutas<3){
            return "Você come poucas frutas por dia";
        }
        else if(frutas<10){
            return "Você como uma boa quantidade de frutas por dia";
        }
        else {
            return "Você tem uma CEASA na barriga! Parabéns!";
        }
    }

    @GetMapping("/frutas-dia/{fruta1}/{fruta2}")
    public String adicionarOutraFruta(@PathVariable String fruta1,@PathVariable String fruta2){
        return "Preparando vitamina de "+fruta1+" e "+fruta2;
    }

    @GetMapping("/milkshake/{sabor}/{quantidade}/{comChantilly}")
    public String milkshakao(@PathVariable String sabor, @PathVariable int quantidade,@PathVariable boolean comChantilly){

        if (quantidade<=0){
            return "Onde já se viu comprar esta quantidade?";
        }
        else {
            Integer precoFinal=10;
            if (comChantilly == true){
                precoFinal=precoFinal+2;
            }
            return "Seus "+quantidade+" shakes de "+sabor+" vão custar "+(precoFinal*quantidade);
        }
    }

}
