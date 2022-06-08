package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Modelo.Curso;

public interface CursoRepository {
	void guardarCurso( Curso cursos);
	void actualizarCurso(Curso cursos);
	void eliminarCurso(Integer id);
	Curso obtenerCurso(Integer id);
	List<Curso> listar(Curso id);


}
