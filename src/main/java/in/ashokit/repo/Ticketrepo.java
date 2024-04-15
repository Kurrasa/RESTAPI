package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Ticket;
import in.ashokit.entity.Train;

public interface Ticketrepo extends JpaRepository<Ticket, Integer> 
{

	
	
}
