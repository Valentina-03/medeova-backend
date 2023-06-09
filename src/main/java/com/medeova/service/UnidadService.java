package com.medeova.service;

import java.util.List;

import com.medeova.model.Actividad;
import com.medeova.model.Tema;
import com.medeova.model.Unidad;

public interface UnidadService 
{
	public void guardar(Unidad nuevo);
    public void eliminar(Integer id);
    public Unidad encontrar(Integer id);
    public List<Unidad> listar();
    public List<Tema> listarByTema(Integer id);
	public Double getPromedio(Integer id);
	public List<Actividad> getActividades(Integer id);
	public List<Actividad> getActividadesCompletadas(Integer id);
}