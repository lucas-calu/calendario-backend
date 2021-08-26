package br.com.token.calendarioeventos.services;

import br.com.token.calendarioeventos.entities.EventoEntity;
import br.com.token.calendarioeventos.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public EventoEntity alterarEvento(Long id, EventoEntity eventoAlterado){
       Optional<EventoEntity> encontrar  = repository.findById(id);
       encontrar.get().setDescricao(eventoAlterado.getDescricao());
       encontrar.get().setInicio(eventoAlterado.getInicio());
       encontrar.get().setFim(eventoAlterado.getFim());
       EventoEntity alterado = repository.save(encontrar.get());
       return alterado;
    }

    public void deletar(Long Id){
        repository.deleteById(Id);

    }

}
