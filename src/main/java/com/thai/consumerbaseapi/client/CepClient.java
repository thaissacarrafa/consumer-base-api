package com.thai.consumerbaseapi.client;

import com.thai.consumerbaseapi.model.CepModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url = "http://viacep.com.br/ws/", value = "cep")
public interface CepClient {

    @GetMapping("{cep}/json/")
    CepModel getAddressByCep(@PathVariable("cep") String cep);
}
