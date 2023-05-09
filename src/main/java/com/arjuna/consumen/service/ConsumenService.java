package com.arjuna.consumen.service;

import com.arjuna.consumen.model.Entity.Consumen;
import com.arjuna.consumen.model.repos.ConsumenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ConsumenService {

    @Autowired
    private ConsumenRepo consumenRepo;

    public Consumen save(Consumen consumen){
        return consumenRepo.save(consumen);
    }

    public Consumen findOne(Long id){
        return consumenRepo.findById(id).get();
    }

    public Iterable<Consumen> findAll(){
        return consumenRepo.findAll();
    }

    public void removeOne(Long id){
        consumenRepo.deleteById(id);
    }

    public List<Consumen> findByNama(String nama){
        return consumenRepo.findByNamaContains(nama);
    }


}
