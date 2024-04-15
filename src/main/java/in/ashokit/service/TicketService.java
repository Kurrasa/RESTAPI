package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Ticket;
import in.ashokit.entity.Train;

public interface TicketService
{
	public Ticket getDetalis(Train train);
	public Ticket getTicket(Integer tId);
	public List<Ticket> getTickets() ;
		

}
