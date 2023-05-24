package br.fatecrl.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.fatecrl.mvc.models.Navio;


@Controller
@RequestMapping("/navios")
public class NaviosController {
    private static final List<Navio> _navios = new ArrayList<Navio>();


    public NaviosController(){
        _navios.add(new Navio("Containe", " MSC ADELAIDE", 9857171));
        _navios.add(new Navio("Passenger", " MSC SEAVIEW", 9745378));
        _navios.add(new Navio("Chemical Tanker", " HORIZON EKAVI", 9404223));
        _navios.add(new Navio("Bulk Carrier", " GREAT LINK", 9738519));
    }

    @GetMapping
    public String getNavios(Model model){
        model.addAttribute("navios", _navios);

        return  "navios";
    }

    @GetMapping("claudio")
    public String getData(Model model){
        Date data = new Date(0);


        model.addAttribute("data", data);

        return  "claudio";
    }
    
    
}
