package br.com.livrariasl.service;

import br.com.livrariasl.dto.CarrosDTO;
import br.com.livrariasl.entity.CarrosEntity;
import br.com.livrariasl.repository.CarrosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrosService {

    @Autowired
    private CarrosRepository carrosRepository;


    public List<CarrosEntity> getAll(){
        return carrosRepository.findAll();
    }

    public Optional<CarrosEntity> getById(Long id){
        return carrosRepository.findById(id);
    }


    public CarrosEntity registraCarro(CarrosDTO carrosDTO){
        CarrosEntity newCarro = new CarrosEntity();
        BeanUtils.copyProperties(carrosDTO , newCarro);
        return carrosRepository.save(newCarro);
    }

    public String apagarLivro(Long id){
        carrosRepository.deleteById(id);
        return "Carro apagado com sucesso";
    }

}
