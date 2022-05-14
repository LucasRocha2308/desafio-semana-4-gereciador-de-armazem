package br.com.semana4_gerenciador_de_armazem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private int id;
    private String productName;
    private double value;
    private double total;
}
