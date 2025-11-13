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

import br.cefetrj.Service.GerenteService;
import br.cefetrj.model.Gerente;
import br.cefetrj.to.input.GerenteToInput;
import br.cefetrj.to.output.GerenteToOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/gerentes", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/gerentes", tags = { "Gerentes - GerenteController" })
public class GerenteController {
    private final GerenteService gerenteService;

    @Autowired
    public GerenteController(GerenteService gerenteService) {
        this.gerenteService = gerenteService;
    }

    @PostMapping
    @ApiOperation(value = "Salvar registro", notes = "Salva um novo registro no banco de dados")
    public ResponseEntity<GerenteToOutput> save(@RequestBody GerenteToInput input) {
        final var gerente = input;

        final Gerente created = gerenteService.save(gerente.build());

        return new ResponseEntity<>(new GerenteToOutput(created),
                HttpStatus.CREATED);
    }

    @PutMapping
    @ApiOperation(value = "Atualizar registro", notes = "Atualiza um registro existente no banco de dados")
    public ResponseEntity<GerenteToOutput> edit(@RequestBody GerenteToInput input) {

        final Gerente created = gerenteService.save(input.build());

        return new ResponseEntity<>(new GerenteToOutput(created), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Pesquisar por ID", notes = "Retorna o registro de acordo com o ID repassado")
    public ResponseEntity<GerenteToOutput> findById(@PathVariable("id") Integer id) {

        return ResponseEntity.ok(gerenteService.findById(id).map(GerenteToOutput::new).orElse(null));

    }

    @GetMapping
    @ApiOperation(value = "Listar todos", notes = "Retorna todos os registros")
    public ResponseEntity<List<GerenteToOutput>> findAll() {

        return ResponseEntity.ok(gerenteService.findAll().stream().map(GerenteToOutput::new).toList());

    }

    @DeleteExchange("/{id}")
    @ApiOperation(value = "Deletar por ID", notes = "Remove o registro de acordo com o ID repassado")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Integer id) {

        gerenteService.delete(id);
        return ResponseEntity.noContent().build();

    }
}