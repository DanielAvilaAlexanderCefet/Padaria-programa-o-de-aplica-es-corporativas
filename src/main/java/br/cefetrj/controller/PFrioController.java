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

import br.cefetrj.Service.PFrioService;
import br.cefetrj.model.PFrio;
import br.cefetrj.to.input.PFrioToInput;
import br.cefetrj.to.output.PFrioToOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/pfrios", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/pfrios", tags = { "PFrios - PFrioController" })
public class PFrioController {
    private final PFrioService pfrioService;

    @Autowired
    public PFrioController(PFrioService pfrioService) {
        this.pfrioService = pfrioService;
    }

    @PostMapping
    @ApiOperation(value = "Salvar registro", notes = "Salva um novo registro no banco de dados")
    public ResponseEntity<PFrioToOutput> save(@RequestBody PFrioToInput input) {
        final var pfrio = input;

        final PFrio created = pfrioService.save(pfrio.build());

        return new ResponseEntity<>(new PFrioToOutput(created),
                HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation(value = "Atualizar registro", notes = "Atualiza um registro existente no banco de dados")
    public ResponseEntity<PFrioToOutput> edit(@RequestBody PFrioToInput input) {

        final PFrio created = pfrioService.save(input.build());

        return new ResponseEntity<>(new PFrioToOutput(created), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Pesquisar por ID", notes = "Retorna o registro de acordo com o ID repassado")
    public ResponseEntity<PFrioToOutput> findById(@PathVariable("id") Integer id) {

        return ResponseEntity.ok(pfrioService.findById(id).map(PFrioToOutput::new).orElse(null));

    }

    @GetMapping
    @ApiOperation(value = "Listar todos", notes = "Retorna todos os registros")
    public ResponseEntity<List<PFrioToOutput>> findAll() {

        return ResponseEntity.ok(pfrioService.findAll().stream().map(PFrioToOutput::new).toList());

    }

    @DeleteExchange("/{id}")
    @ApiOperation(value = "Deletar por ID", notes = "Remove o registro de acordo com o ID repassado")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id) {

        pfrioService.delete(id);
        return ResponseEntity.noContent().build();

    }
}