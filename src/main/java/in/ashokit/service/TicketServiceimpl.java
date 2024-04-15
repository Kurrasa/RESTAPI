package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Ticket;
import in.ashokit.entity.Train;
import in.ashokit.repo.Ticketrepo;

@Service
public class TicketServiceimpl implements TicketService
{
	@Autowired
	private Ticketrepo ticketrepo;

	@Override
	public Ticket getDetalis(Train train)
	{
		Ticket t=new Ticket();
		BeanUtils.copyProperties(train, t);
		t.setStatus("confrimed");
	 
		Ticket tickets=ticketrepo.save(t);
		
		return tickets;
	}

	@Override
	public Ticket getTicket(Integer tId) {
		// TODO Auto-generated method stub
		Optional<Ticket> byId = ticketrepo.findById(tId);
		if(byId.isPresent())
		{
			return byId.get();
		}
		return null;
		
	}

	@Override
	public List<Ticket> getTickets() {
		return ticketrepo.findAll();
	};
	}
	
	
	


