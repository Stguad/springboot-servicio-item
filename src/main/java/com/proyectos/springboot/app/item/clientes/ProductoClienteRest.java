package com.proyectos.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.proyectos.springboot.app.item.models.Producto;

//@FeignClient(name = "servicio-productos", url = "localhost:8001")
@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {

	@GetMapping(path =  "/listar")
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable(name = "id") Long id);
}
