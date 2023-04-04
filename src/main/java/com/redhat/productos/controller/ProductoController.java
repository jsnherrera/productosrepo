package com.redhat.productos.controller;

import com.redhat.productos.entity.Productos;
import com.redhat.productos.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductosService service;

    @GetMapping(path = "/{id_prod}")
    public ResponseEntity<Productos> findById(@PathVariable("id_prod") Integer id_prod) {
        return ResponseEntity.ok().body(service.findById(id_prod));
    }

    @GetMapping(path = "")
    public ResponseEntity<List<Productos>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
