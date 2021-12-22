package Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Customer;


	public interface CustRepository extends JpaRepository <Customer,Integer>
	{
		
	}



