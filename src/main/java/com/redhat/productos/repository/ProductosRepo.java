package com.redhat.productos.repository;

import com.redhat.productos.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepo extends JpaRepository<Productos, Integer> {
}
