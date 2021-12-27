package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.ContactForm;
import in.ashokit.service.ContactServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {
	
	@Autowired
	private ContactServiceImpl service;
	
	@PostMapping("/save")
	public String saveContact(@RequestBody ContactForm contactForm) {
		return service.saveContact(contactForm);
	}
	
	@GetMapping("/contacts")
	public List<ContactForm> findAllContacts(){
		return service.findAllContacts();
	}
	
	@GetMapping("/edit/{contactId}")
	public ContactForm editContact(@PathVariable("contactId") Integer id) {
		return service.editContact(id);
	}
	
	@DeleteMapping("/delete/{contactId}")
	public List<ContactForm> deleteContact(@PathVariable("contactId") Integer id){
		return service.deleteContact(id);
	}
	
	@DeleteMapping("/sdelete/{contactId}")
	public List<ContactForm> sdeleteContact(@PathVariable("contactId") Integer id){
		return service.deleteContact(id);
	}
}
