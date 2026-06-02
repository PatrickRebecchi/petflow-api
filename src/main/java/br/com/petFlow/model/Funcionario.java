package br.com.petFlow.model;

import br.com.petFlow.model.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "funcionarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
    private String telefone;
    @Column(unique = true)
    private String email;
    private String senha;
    private BigDecimal salario;
    @Enumerated(EnumType.STRING)
    private Role role;


}