package com.example.empleados.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empleados.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado,Integer> {



	
}
