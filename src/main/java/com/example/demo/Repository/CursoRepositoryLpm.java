package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Modelo.Curso;

public class CursoRepositoryLpm implements CursoRepository {
	
	public List<Curso> listar = new ArrayList<Curso>();
	

	@Override
	public void guardarCurso(Curso cursos) {
		// TODO Auto-generated method stub
		listar.add(cursos);
		
	}

	@Override
	public void actualizarCurso(Curso cursos) {
		listar.remove(0);
		listar.add(cursos);
		
	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		Curso p = obtenerCurso(id);
		listar.remove(0);
		
	}

	@Override
	public Curso obtenerCurso(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(p -> p.getIdCurso()== id).findFirst().orElse(null);
	}

	@Override
	public List<Curso> listar(Curso id) {
		// TODO Auto-generated method stub
		return listar;
	}

}
