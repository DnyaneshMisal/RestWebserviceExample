package org.dnyanesh.site.messanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.dnyanesh.site.messanger.model.Message;
import org.dnyanesh.site.messanger.service.MessageService;


@Path("/messages")
public class MessageResource {
	
	MessageService messageService =new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
		public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{msgId}")
	public Message getMessage(@PathParam("msgId") long Id){
		return messageService.getMessage(Id);
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		
		return messageService.addMessage(message);
	}
	
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{msgId}")
	public Message updateMessage(@PathParam("msgId") long Id,Message message){
		message.setId(Id);
		return messageService.updateMessage(message);
	}
	
}
