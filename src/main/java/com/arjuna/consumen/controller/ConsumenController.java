package com.arjuna.consumen.controller;

import com.arjuna.consumen.model.Entity.Consumen;
import com.arjuna.consumen.service.ConsumenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consumens")
public class ConsumenController {

    @Autowired
    private ConsumenService consumenService;

    @PostMapping
    public Consumen create(@RequestBody Consumen consumen){
        return consumenService.save(consumen);
    }

    @GetMapping
    public Iterable<Consumen> findAll(){
        return consumenService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id){
        consumenService.removeOne(id);
    }


}
