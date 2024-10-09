package br.com.livrariasl.dto;

import br.com.livrariasl.entity.Marca;

import java.util.List;

public record CarrosDTO(String nome,
                        List<String> image,
                        String cilindrada,
                        String ano,
                        Marca marca){

}
