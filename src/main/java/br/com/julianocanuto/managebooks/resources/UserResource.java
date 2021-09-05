package br.com.julianocanuto.managebooks.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.julianocanuto.managebooks.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {

		User u = new User(1L, "Juliano", "juliano@gmail.com", "9123456789", "xy!z64.*372K_g");
		return ResponseEntity.ok().body(u);
	}
}
