package br.com.token.CalendarioEventos.repositories;

import br.com.token.CalendarioEventos.entities.EventoEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<EventoEntity, Long> {

}
