package br.com.token.calendarioeventos.controller;

import br.com.token.calendarioeventos.entities.EventoEntity;
import br.com.token.calendarioeventos.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
@CrossOrigin(origins = "http://localhost:3000")
public class EventoController {

    @Autowired
    EventoService service;


    @GetMapping("/{id}")
    public EventoEntity eventoPorId(@PathVariable("id") Long idEvento){
        EventoEntity eventoFinal = service.obterPorId(idEvento);
        return eventoFinal;
    }

    @GetMapping()
    public Iterable<EventoEntity> obterTodos(){
        Iterable<EventoEntity> todos = service.obterTudo();
        return todos;
    }

    @PostMapping()
    public EventoEntity salvar(@RequestBody EventoEntity eventoParaSalvar){
        EventoEntity salvo = service.salvarEvento(eventoParaSalvar);
        return salvo;
    }

    @PutMapping("/{id}")
    public EventoEntity alterar(@PathVariable("id") Long id, @RequestBody EventoEntity eventoParaAlterar){
        EventoEntity alterado = service.alterarEvento(id, eventoParaAlterar);
        return alterado;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id){
        service.deletar(id);

    }

}
