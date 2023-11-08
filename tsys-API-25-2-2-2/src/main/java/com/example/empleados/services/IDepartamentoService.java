package com.example.empleados.services;
import java.util.List;

import com.example.empleados.dto.Departamento;

public interface IDepartamentoService {
	
	//Listar todos
	public List<Departamento> listarDepartamentos();
	
	//Listar por id
	public Departamento departamentoXID(Integer id); 
	
	//Guardar
	public Departamento guardarDepartamento(Departamento Departamento);
	
	//Actualizar
	public Departamento actualizarDepartamento(Departamento Departamento);
	
	//Eliminar
	public void eliminarDepartamento(Integer id);

	
}
