package br.com.token.calendarioeventos.repositories;

import br.com.token.calendarioeventos.entities.EventoEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<EventoEntity, Long> {

}
