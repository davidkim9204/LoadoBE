package Loado.simulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Loado.simulator.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	Item findById(long id);
}
