package com.redhat.productos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_prod;
    private String nombre;
    private double precio;
}
