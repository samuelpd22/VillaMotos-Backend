package br.com.livrariasl.repository;

import br.com.livrariasl.entity.CarrosEntity;
import br.com.livrariasl.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarrosRepository extends JpaRepository<CarrosEntity, Long> {

    List<CarrosEntity> findByMarca(Marca marca);

}
