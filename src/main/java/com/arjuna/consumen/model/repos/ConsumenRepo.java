package com.arjuna.consumen.model.repos;

import com.arjuna.consumen.model.Entity.Consumen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConsumenRepo extends CrudRepository<Consumen, Long> {
    List<Consumen> findByNamaContains(String nama);

}
