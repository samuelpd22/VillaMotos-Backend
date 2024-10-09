package br.com.livrariasl.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table ( name = "tb_carrosSL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarrosEntity {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;


    @Column(length = 1000)
    private List<String> image;

    @Column(length = 1000)
    private String cilindrada;

    private String ano;

    @Enumerated(EnumType.STRING)
    private Marca marca;




}
