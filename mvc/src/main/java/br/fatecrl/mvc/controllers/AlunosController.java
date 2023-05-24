package br.fatecrl.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.fatecrl.mvc.models.Aluno;


@Controller
@RequestMapping("/alunos")
public class AlunosController {
    private static final List<Aluno> _alunos = new ArrayList<Aluno>();


    public AlunosController(){
        _alunos.add(new Aluno("717174", " Michel", 8, 6));
        _alunos.add(new Aluno("456987", " Vitor", 9, 5));
        _alunos.add(new Aluno("845236", " Rhayadh", 10, 5));

    }

    @GetMapping
    public String getAlunos(Model model){
        model.addAttribute("alunos", _alunos);

        return  "alunos";
    }

    @GetMapping("claudio")
    public String getData(Model model){
        Date data = new Date(0);


        model.addAttribute("data", data);

        return  "claudio";
    }
    
    
}
