package com.thai.consumerbaseapi.controller;

import com.thai.consumerbaseapi.client.CepClient;
import com.thai.consumerbaseapi.model.CepModel;
import com.thai.consumerbaseapi.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// não possui regras de negócio


@RestController
public class CepController {

    @Autowired
    public CepService cepService;

    @GetMapping("api/{cep}")
    public ResponseEntity<CepModel> getCep(@PathVariable String cep) {

        CepModel address = this.cepService.getAddressByCep(cep);

        return address != null ? ResponseEntity.ok().body(address) : ResponseEntity.notFound().build();
    }
}