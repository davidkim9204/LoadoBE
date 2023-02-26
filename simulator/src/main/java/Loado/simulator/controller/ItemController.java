package Loado.simulator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Loado.simulator.model.Item;
import Loado.simulator.repository.ItemRepository;

import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class ItemController {

	private final Logger log = LoggerFactory.getLogger(ItemController.class);
	private ItemRepository itemRepository;

	public ItemController(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	@GetMapping("/test")
    public String test() {
        return "Hello, world!";
    }

	@GetMapping("/items")
	Collection<Item> items() {
		return itemRepository.findAll();
	}

	@GetMapping("/item/{id}")
	ResponseEntity<?> getGroup(@PathVariable Long id) {
		Optional<Item> group = itemRepository.findById(id);
		return group.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

}
