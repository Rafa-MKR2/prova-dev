package br.com.codarts;


import br.com.codarts.model.Cliente;
import br.com.codarts.model.ModalidadeModel;
import br.com.codarts.model.NegociacaoModel;
import br.com.codarts.model.ResponseCliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@SpringBootApplication
@RestController
public class ProvaDevPlenoApplication {

    private NegociacaoModel negociacaoModel;
    public static void main(String[] args) {
        SpringApplication.run(ProvaDevPlenoApplication.class,args);

    }


    @GetMapping("/cliente")
    public Cliente home(){
        Cliente c = new Cliente();

        c.setNome("Rafael");
        c.setCpf("123.456.789-10");
        c.setIdade(25);
        c.setUf("Caucaia");
        c.setSalario(4500);
        return c;
    }




    @PostMapping("/cliente")
    public ResponseEntity<ResponseCliente> consulta(@Valid @RequestBody Cliente c, UriComponentsBuilder uirBuilder){


         this.negociacaoModel = new NegociacaoModel(c);

        URI uri = uirBuilder.path("/cliente").build().toUri();
        return ResponseEntity.created(uri).body(this.negociacaoModel.verifiqueModalidade());
    }

}
