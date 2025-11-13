package br.cefetrj.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import br.cefetrj.Service.IndustrializadoService;
import br.cefetrj.model.Industrializado;
import br.cefetrj.to.input.IndustrializadoToInput;
import br.cefetrj.to.output.IndustrializadoToOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/industrializados", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/industrializados", tags = { "Industrializados - IndustrializadoController" })
public class IndustrializadoController {
    private final IndustrializadoService industrializadoService;

    @Autowired
    public IndustrializadoController(IndustrializadoService industrializadoService) {
        this.industrializadoService = industrializadoService;
    }

    @PostMapping
    @ApiOperation(value = "Salvar registro", notes = "Salva um novo registro no banco de dados")
    public ResponseEntity<IndustrializadoToOutput> save(@RequestBody IndustrializadoToInput input) {
        final var industrializado = input;

        final Industrializado created = industrializadoService.save(industrializado.build());

        return new ResponseEntity<>(new IndustrializadoToOutput(created),
                HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation(value = "Atualizar registro", notes = "Atualiza um registro existente no banco de dados")
    public ResponseEntity<IndustrializadoToOutput> edit(@RequestBody IndustrializadoToInput input) {

        final Industrializado created = industrializadoService.save(input.build());

        return new ResponseEntity<>(new IndustrializadoToOutput(created), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Pesquisar por ID", notes = "Retorna o registro de acordo com o ID repassado")
    public ResponseEntity<IndustrializadoToOutput> findById(@PathVariable("id") Integer id) {

        return ResponseEntity.ok(industrializadoService.findById(id).map(IndustrializadoToOutput::new).orElse(null));

    }

    @GetMapping
    @ApiOperation(value = "Listar todos", notes = "Retorna todos os registros")
    public ResponseEntity<List<IndustrializadoToOutput>> findAll() {

        return ResponseEntity.ok(industrializadoService.findAll().stream().map(IndustrializadoToOutput::new).toList());

    }

    @DeleteExchange("/{id}")
    @ApiOperation(value = "Deletar por ID", notes = "Remove o registro de acordo com o ID repassado")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id) {

        industrializadoService.delete(id);
        return ResponseEntity.noContent().build();

    }
}