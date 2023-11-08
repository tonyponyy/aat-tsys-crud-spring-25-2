package com.example.empleados.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empleados.dto.Departamento;


public interface IDepartamentoDAO extends JpaRepository<Departamento,Integer> {



	
}
