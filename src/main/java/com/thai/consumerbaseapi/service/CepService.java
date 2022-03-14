package com.thai.consumerbaseapi.service;

import com.thai.consumerbaseapi.client.CepClient;
import com.thai.consumerbaseapi.model.CepModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

//regras de negócio, validação e etc

@Service
public class CepService {

    @Autowired
    public CepClient cepClient;

    public CepModel getAddressByCep(String cep) {
        validateCepLength(cep);
        return this.cepClient.getAddressByCep(cep);
    }

    private void validateCepLength(String cep) {
        if (cep.length() != 8) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CEP must to have eight digits!");
        }    }
}
