package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Orders;

public interface orderRepository extends JpaRepository <Orders,Integer> {

}
