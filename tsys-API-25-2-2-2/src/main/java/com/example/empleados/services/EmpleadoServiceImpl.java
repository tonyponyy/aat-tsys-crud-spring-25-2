package com.example.empleados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empleados.dao.IEmpleadoDAO;
import com.example.empleados.dto.Empleado;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	//Listar todos
		public List<Empleado> listarEmpleados(){
			return iEmpleadoDAO.findAll();
		};
		
		
		//Listar por id
		public Empleado empleadoXID(Integer id) {
			return iEmpleadoDAO.findById(id).get();
		}; 
		
		//Guardar
		public Empleado guardarEmpleado(Empleado Empleado) {
			return iEmpleadoDAO.save(Empleado);
		};
		
		//Actualizar
		public Empleado actualizarEmpleado(Empleado Empleado) {
			return iEmpleadoDAO.save(Empleado);
		};
		
		//Eliminar
		public void eliminarEmpleado(Integer id) {
			iEmpleadoDAO.deleteById(id);
		}
		 


}
