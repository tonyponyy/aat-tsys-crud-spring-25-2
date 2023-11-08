package com.example.empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empleados.dto.Departamento;
import com.example.empleados.services.DepartamentoServiceImpl;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl DepartamentoServideImpl;
	
	@GetMapping("/all")
	public List<Departamento> listarDepartamentos(){
		return DepartamentoServideImpl.listarDepartamentos();
	}
	

	@PostMapping("/add")
	public Departamento salvarDepartamento(@RequestBody Departamento Departamento) {
		return DepartamentoServideImpl.guardarDepartamento(Departamento);
	}
	
	
	@GetMapping("/{id}")
	public Departamento DepartamentoXID(@PathVariable(name="id") Integer id) {
		
		Departamento Departamento_xid= new Departamento();
		
		Departamento_xid=DepartamentoServideImpl.departamentoXID(id);
		
		//System.out.println("Departamento XID: "+Departamento_xid);
		
		return Departamento_xid;
	}
	
	@PutMapping("/{id}")
	public Departamento actualizarDepartamento(@PathVariable(name="id")Integer id,@RequestBody Departamento Departamento) {
		
		Departamento Departamento_seleccionado= new Departamento();
		Departamento Departamento_actualizado= new Departamento();
		
		Departamento_seleccionado= DepartamentoServideImpl.departamentoXID(id);
		
		Departamento_seleccionado.setNombre(Departamento.getNombre());

		
		Departamento_actualizado = DepartamentoServideImpl.actualizarDepartamento(Departamento_seleccionado);
		
		System.out.println("El Departamento actualizado es: "+ Departamento_actualizado);
		
		return Departamento_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarDepartamento(@PathVariable(name="id")Integer id) {
		DepartamentoServideImpl.eliminarDepartamento(id);
		System.out.println("Departamento eliminado");
	}
	
	
}