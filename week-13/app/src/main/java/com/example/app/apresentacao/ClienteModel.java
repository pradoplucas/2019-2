package com.example.app.apresentacao;

import com.example.app.persistencia.Pais;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteModel 
{
    

    private int id;
    private String nome;
    private int idade;
    private double limiteCredito;
    private String telefone;

    @ManyToOne
    private Pais pais;
}
