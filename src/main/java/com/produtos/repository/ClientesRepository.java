package com.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.models.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
