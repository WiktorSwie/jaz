package com.example.homework;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

	@GetMapping("/zadanie/{value}")
	public ResponseEntity<String> getPathValue(@PathVariable String value) {
		return ResponseEntity.ok(value);
	}


	@GetMapping("/zapytanie")
	public ResponseEntity<String> getQueryValue(@RequestParam String value) {
		return ResponseEntity.ok(value);
	}


	@PutMapping("/aktualizuj/{id}")
	public ResponseEntity<String> updateData(@PathVariable Long id, @RequestBody String data) {

		return ResponseEntity.ok(id + data);
	}


	@PostMapping("/stworz")
	public ResponseEntity<String> createData(@RequestBody String data) {

		return ResponseEntity.ok(data);
	}


	@DeleteMapping("/usun/{id}")
	public ResponseEntity<Void> deleteData(@PathVariable Long id) {

		return ResponseEntity.ok().build();
	}
}
