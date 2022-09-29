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

import com.vkart.entity.Gifts;

import com.vkart.service.GiftService;
@RestController
@RequestMapping("/api/gifts")
public class GiftsController {
	@Autowired
	private GiftService giftsService;
	
	@PostMapping("/add")
	public Gifts saveGifts(@RequestBody Gifts gifts) {
		return giftsService.saveGift(gifts);
	}
	@PutMapping("/update")
	public Gifts updateGifts(@RequestBody Gifts gifts) {
		return giftsService.updateGift(gifts);
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteGiftss(@PathVariable int id) {
		giftsService.deleteGift(id);
		return true;
	}
	@GetMapping("/get")
	public List<Gifts> getAllGifts(@RequestBody Gifts gifts){
		return giftsService.getGifts();
	}
	@GetMapping("/get/{id}")
	public Gifts getbyGift( @PathVariable int id, @RequestBody Gifts gifts ) {
		return giftsService.getbyId(id, gifts);
	}
}
