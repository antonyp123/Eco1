package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Modelo.Curso;
import com.example.demo.Repository.CursoRepository;

public class CursoServiceLpm implements CursoService {
	
	@Autowired
	private CursoRepository repository;

	@Override
	public void guardarCurso(Curso cursos) {
		repository.guardarCurso(cursos);
		
	}

	@Override
	public void actualizarCurso(Curso cursos) {
		repository.actualizarCurso(cursos);
		
	}

	@Override
	public void eliminarCurso(Integer id) {
		repository.eliminarCurso(id);
		
	}

	@Override
	public Curso obtenerCurso(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtenerCurso(id);
	}

	@Override
	public List<Curso> listar(Curso id) {
		// TODO Auto-generated method stub
		return repository.listar(id);
	}
	
	

}
