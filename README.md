# Consumer-base-api! 📍🗺️



> Integração com o Via CEP, responsável por disponibilizar o endereço vinculado a determinado CEP.


### 📈 Objetivo

O projeto tem como objetivo implementar o Feign Client, bem como servirá para integração do maes-que-codam-api, que atualmente está em desenvolvimento.



### 💻 Informações relevantes

Este projeto utilizará as seguintes tecnologias:


<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" width="100px;" alt="Foto Java"/><br>
        <sub>
          <b> Java </b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot" width="100px;" alt="Foto Spring Boot"/><br>
        <sub>
          <b>Sring Boot</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" width="100px;" alt="Foto Maven"/><br>
        <sub>
          <b>Maven</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

### 💻 Executar o projeto


Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/{cep}
```

### Funcionalidades  🖥
- Busca por CEP - GET

 
 ### Modelo com campos que retornarão:  📩


```
"cep": "29119-055",
"logradouro": "Rua Ângelo Antônio Fernandes",
"complemento": "",
"bairro": "Ataíde",
"localidade": "Vila Velha",
"uf": "ES"
}
```
