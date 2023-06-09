package com.medeova.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medeova.dao.*;
import com.medeova.model.*;
import com.medeova.service.TemaService;

@Service
public class TemaServiceImp implements TemaService 
{
	@Autowired
    private TemaDAO dao;
	
	@Autowired
    private SubtemaDAO sub_dao;
	
    
    @Override
    @Transactional
	public void guardar(Tema nuevo) {
		this.dao.save(nuevo);		
	}

	@Override
	@Transactional
	public void eliminar(Integer id) {
		this.dao.deleteById(id);		
	}

	@Override
	@Transactional(readOnly = true)
	public Tema encontrar(Integer id) {
		return this.dao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Tema> listar() {
		return this.dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Subtema> getSubtemas(Integer id) {
		return sub_dao.getSubtemas(id);
	}
}