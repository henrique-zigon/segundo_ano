package br.com.bandtec.projeto03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/boletins")
public class BoletinsController {

    private Boletim meuBoletim=new Boletim("Lady Gaga",8.5,9.5);
    private List<Boletim> listaBoletim=new ArrayList<Boletim>();


    public BoletinsController() {
        this.listaBoletim.add(new Boletim("Lady Gaga 1",6.5,4.5));
        this.listaBoletim.add(new Boletim("Lady Gaga 2",9.5,5.0));
        this.listaBoletim.add(new Boletim("Lady Gaga 3",8.0,8.0));
    }

    @GetMapping("/meu-boletim")
    public Boletim meuBoletim(){
        return this.meuBoletim;
    }


    @GetMapping("/lista")
    public List<Boletim> listar(){
        return this.listaBoletim;
    }


    @GetMapping("/cadastrar/{aluno}/{n1}/{n2}")
    public String cadastro(@PathVariable String aluno,
                           @PathVariable Double n1,
                           @PathVariable Double n2){
        this.listaBoletim.add(new Boletim(aluno,n1,n2));
        return "Boletim cadastrado com sucesso";
    }


    @GetMapping("/recuperar/{posicao}")
    public Boletim localizar(@PathVariable Integer posicao){
        if (this.listaBoletim.size()+1>posicao){
            return this.listaBoletim.get(posicao);
        }
        else {
            return null;
        }
    }


    @GetMapping("atualizar/{posicao}/{aluno}/{n1}/{n2}")
    public String atualizar(@PathVariable Integer posicao, @PathVariable String aluno,@PathVariable Double n1,@PathVariable Double n2){
        if (this.listaBoletim.size()+1>posicao){
            Boletim boletimVez=this.listaBoletim.get(posicao);
            boletimVez.setAluno(aluno);
            boletimVez.setNota1(n1);
            boletimVez.setNota2(n2);
            //pode ser this.listaBoletim.set(posicao, new Boletim("x",x,x))
            return "Boletim atualizado";
        }
        else {
            return "Boletim não encontrado";
        }
    }


    @GetMapping("/pesquisar/{aluno}")
    public List<Boletim> pesquisarLike(@PathVariable String aluno){
        List<Boletim> listinha=new ArrayList<Boletim>();
        for (Boletim boletimVez : listaBoletim){
            if (this.listaBoletim.contains(aluno)) {
                listinha.add(boletimVez);
            }
        }
        return listinha;
        /*
        if (listinha.size()>=1) {
            return listinha;
        }
        else {
            return null;
        }
    */
    }
}
