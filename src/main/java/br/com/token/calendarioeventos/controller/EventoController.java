package br.com.token.calendarioeventos.controller;

import br.com.token.calendarioeventos.entities.EventoEntity;
import br.com.token.calendarioeventos.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    EventoRepository repository;

    @GetMapping("/{idEvento}")
    public EventoEntity obterPorId(@PathVariable Long idEvento){
        return repository.findById(idEvento).get();
    }

}
