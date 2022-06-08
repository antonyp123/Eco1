package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Modelo.Curso;
import com.example.demo.Service.CursoService;


@Controller
@RequestMapping("/curso/v1")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@RequestMapping("/listar")
	public @ResponseBody List<Curso>listar(){
		return service.listar(null);
	}
	
}
