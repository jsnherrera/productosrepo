package com.redhat.productos.service;

import com.redhat.productos.entity.Productos;
import com.redhat.productos.repository.ProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepo repo;

    public Productos findById(Integer id_prod) {
        Optional<Productos> optProduct = this.repo.findById(id_prod);
        return optProduct.isPresent() ? optProduct.get() : null;
    }

    public List<Productos> findAll() {
        return this.repo.findAll();
    }
}
