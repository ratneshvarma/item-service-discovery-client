package com.ratnesh.itemservicediscoveryclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ratnesh.itemservicediscoveryclient.dto.ItemDto;
import com.ratnesh.itemservicediscoveryclient.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/items")
	public List<ItemDto> getItems(){
		return itemService.getItems();
	}
	@GetMapping("/items/{productCode}")
	public ItemDto getItems(@PathVariable("productCode") String productCode){
		return itemService.getItem(productCode);
	}
}
