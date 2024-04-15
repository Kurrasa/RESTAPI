package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Ticket;
import in.ashokit.entity.Train;
import in.ashokit.service.TicketService;

@RestController
public class TickerController
{
	@Autowired
	private TicketService service;

	@PostMapping(
			value = "/ticket")
	public ResponseEntity<Ticket>gettickets(@RequestBody Train train)
	{
		Ticket ticket = service.getDetalis(train);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping(
			value="ticket/{tid}")
			
	public ResponseEntity<Ticket>getTicket(@RequestParam("tId") Integer tId)
	{
		Ticket ticket = service.getTicket(tId);
		
		return new ResponseEntity<>(ticket,HttpStatus.OK);
	}
	@GetMapping(
			value="/tickets")
			
	
	public ResponseEntity<List<Ticket>> getAllTickets(){
		 List<Ticket> tickets = (List<Ticket>) service.getTickets();
		 return new ResponseEntity<>(tickets,HttpStatus.OK);
	}
}
