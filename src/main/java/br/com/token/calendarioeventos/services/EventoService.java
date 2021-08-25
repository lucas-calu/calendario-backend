package br.com.token.calendarioeventos.services;

import br.com.token.calendarioeventos.entities.EventoEntity;
import br.com.token.calendarioeventos.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService {
    @Autowired
    EventoRepository repository;

    public EventoEntity obterPorId(Long idDoEventoBuscado){
        EventoEntity evento = repository.findById(idDoEventoBuscado).get();
        return evento;
    }

    public Iterable<EventoEntity> obterTudo(){
        Iterable<EventoEntity> iteratorDeEventos = repository.findAll();
        return iteratorDeEventos;
    }

    public EventoEntity salvarEvento(EventoEntity eventoEnviado){
        EventoEntity eventoSalvo = repository.save(eventoEnviado);
        return eventoSalvo;
    }
}
