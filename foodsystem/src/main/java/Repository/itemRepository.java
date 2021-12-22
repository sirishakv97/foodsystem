package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.items;

public interface itemRepository extends JpaRepository <items,Integer> {

}
