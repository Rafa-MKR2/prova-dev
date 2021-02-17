package br.com.codarts;


import br.com.codarts.model.Cliente;
import br.com.codarts.model.ModalidadeModel;
import br.com.codarts.model.NegociacaoModel;
import br.com.codarts.model.ResponseCliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@SpringBootApplication
@Controller
public class ProvaDevPlenoApplication {

    private NegociacaoModel negociacaoModel;
    public static void main(String[] args) {
        SpringApplication.run(ProvaDevPlenoApplication.class,args);

    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }




    @PostMapping("/cliente")
    public ResponseEntity<ResponseCliente> consulta(@Valid @RequestBody Cliente c, UriComponentsBuilder uirBuilder){


         this.negociacaoModel = new NegociacaoModel(c);

        URI uri = uirBuilder.path("/cliente").build().toUri();
        return ResponseEntity.created(uri).body(this.negociacaoModel.verifiqueModalidade());
    }

}
