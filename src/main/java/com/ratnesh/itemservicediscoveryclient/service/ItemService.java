package com.ratnesh.itemservicediscoveryclient.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ratnesh.itemservicediscoveryclient.dto.ItemDto;

@Service
public class ItemService {
	public List<ItemDto> getItems() {
		List<ItemDto> items = new ArrayList<>();
		items.add(new ItemDto("ITEM0001", "Milk", 30, 1.50f));
		items.add(new ItemDto("ITEM0002", "Chocklate", 5, 1.75f));
		items.add(new ItemDto("ITEM0003", "Apple", 10, 1.0f));
		return items;
	}

	public ItemDto getItem(String productCode) {
		ItemDto item = null;
		try {
			item = getItems().stream().filter(i -> i.getProductCode().equals(productCode)).findAny().get();
		} catch (Exception e) {
			// Not found error
		}
		return item;
	}
}
