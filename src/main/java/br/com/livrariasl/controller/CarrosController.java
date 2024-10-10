package br.com.livrariasl.controller;

import br.com.livrariasl.dto.CarrosDTO;
import br.com.livrariasl.entity.CarrosEntity;
import br.com.livrariasl.entity.Marca;
import br.com.livrariasl.repository.CarrosRepository;
import br.com.livrariasl.service.CarrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RequestMapping("/carros")
@RestController
public class CarrosController {


    @Autowired
    private CarrosService carrosService;




    @PostMapping("/enviar")
    public ResponseEntity<CarrosEntity> enviarCarro(@RequestBody CarrosDTO carrosDTO){
        return ResponseEntity.ok(carrosService.registraCarro(carrosDTO));

    }
    @GetMapping
    public ResponseEntity<List> verCarros(){
        return new ResponseEntity(carrosService.getAll(), HttpStatus.OK);
    }



    @GetMapping("/pegar/{id}")
    public ResponseEntity<CarrosEntity> pegarPorId(@PathVariable Long id) {
        return new ResponseEntity(carrosService.getById(id),HttpStatus.OK);
    }





    // Sem utilizade até o momento
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(carrosService.apagarLivro(id));
    }


    @GetMapping("/marca/{marca}")
    public List<CarrosEntity> buscarLivrosPorGenero(@PathVariable Marca marca) {
        return carrosService.buscarPorMarca(String.valueOf(marca));
    }





}
