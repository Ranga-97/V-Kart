package com.vkart.controller;

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

import com.vkart.entity.Dresses;
import com.vkart.service.DressesService;
@RestController
@RequestMapping("/api/dresses")
public class DressesController {
	@Autowired
	private DressesService dressesService;
	
	@PostMapping("/add")
	public Dresses saveDress(@RequestBody Dresses dresses) {
		return dressesService.saveDress(dresses);
	}
	@PutMapping("/update/{id}")
	public Dresses updateDress(@RequestBody Dresses dresses, @PathVariable int id ) {
		dresses.setId(id);
		return dressesService.updateDress(dresses);
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteDress(@PathVariable int id) {
		dressesService.deleteDress(id);
		return true;
	}
	@GetMapping("/get")
	public List<Dresses> getAllDresses(@RequestBody Dresses dresses){
		return dressesService.getDresses(dresses);
	}
	@GetMapping("/get/{id}")
	public Dresses getbyDress( @PathVariable int id, @RequestBody Dresses dresses ) {
		return dressesService.getbyId(id, dresses);
	}
}
