package br.fatecrl.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import br.fatecrl.mvc.models.Navio;

@RestController
@RequestMapping("/navios/api")
public class NaviosAPIController {
    private static final List<Navio> _navios = new ArrayList<Navio>();


    public NaviosAPIController(){
        _navios.add(new Navio("Containe", " MSC ADELAIDE", 9857171));
        _navios.add(new Navio("Passenger", " MSC SEAVIEW", 9745378));
        _navios.add(new Navio("Chemical Tanker", " HORIZON EKAVI", 9404223));
        _navios.add(new Navio("Bulk Carrier", " GREAT LINK", 9738519));
    }

    @GetMapping
    public List<Navio> getNavios(){
        return  _navios;
    }   
}
