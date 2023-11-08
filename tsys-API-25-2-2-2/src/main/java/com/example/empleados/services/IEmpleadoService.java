package com.example.empleados.services;
import java.util.List;

import com.example.empleados.dto.Empleado;

public interface IEmpleadoService {
	
	//Listar todos
	public List<Empleado> listarEmpleados();
	
	//Listar por id
	public Empleado empleadoXID(Integer id); 
	
	//Guardar
	public Empleado guardarEmpleado(Empleado Empleado);
	
	//Actualizar
	public Empleado actualizarEmpleado(Empleado Empleado);
	
	//Eliminar
	public void eliminarEmpleado(Integer id);

	
}
