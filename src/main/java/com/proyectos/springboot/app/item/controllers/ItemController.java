package com.proyectos.springboot.app.item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.proyectos.springboot.app.item.models.Item;
import com.proyectos.springboot.app.item.models.service.IItemService;

@RestController
public class ItemController {

	@Autowired
	@Qualifier("serviceFeign")
//	@Qualifier("serviceRestTemplate")

	private IItemService itemService;
	
	@GetMapping(path = "/listar")
	public List<Item> listar(){
		return itemService.findAll();
	}
	
	@GetMapping(path = "/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
				
	}
}
