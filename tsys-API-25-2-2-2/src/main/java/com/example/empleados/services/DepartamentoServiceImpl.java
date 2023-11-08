package com.example.empleados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empleados.dao.IDepartamentoDAO;
import com.example.empleados.dto.Departamento;


@Service
public class DepartamentoServiceImpl implements IDepartamentoService {
	
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;

	//Listar todos
		public List<Departamento> listarDepartamentos(){
			return iDepartamentoDAO.findAll();
		};
		
		
		//Listar por id
		public Departamento departamentoXID(Integer id) {
			return iDepartamentoDAO.findById(id).get();
		}; 
		
		//Guardar
		public Departamento guardarDepartamento(Departamento Departamento) {
			return iDepartamentoDAO.save(Departamento);
		};
		
		//Actualizar
		public Departamento actualizarDepartamento(Departamento Departamento) {
			return iDepartamentoDAO.save(Departamento);
		};
		
		//Eliminar
		public void eliminarDepartamento(Integer id) {
			iDepartamentoDAO.deleteById(id);
		}
		 


}
