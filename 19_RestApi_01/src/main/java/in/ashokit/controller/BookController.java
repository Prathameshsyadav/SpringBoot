package in.ashokit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;

@RestController
public class BookController {
	
	@GetMapping(value = "/book", produces = "application/json")
	public ResponseEntity<Book> getBook(){
		Book b = new Book();
		b.setId(1);
		b.setBookName("Jacks and Jones");
		b.setPrice(100.00);
		
		return new ResponseEntity<Book>(b, HttpStatus.OK);
	}
	
	@GetMapping(value = "/books", produces = "application/json")
	public ResponseEntity<List<Book>> getBooks(){
		Book b = new Book();
		b.setId(1);
		b.setBookName("Jacks and Jones");
		b.setPrice(100.00);
		
		Book b1 = new Book();
		b1.setId(2);
		b1.setBookName("Milleiniums paar");
		b1.setPrice(500.00);
		
		Book b3 = new Book();
		b3.setId(3);
		b3.setBookName("Sean and waves");
		b3.setPrice(350.00);
		
		List<Book> of = List.of(b,b1,b3);
		
		return new ResponseEntity<List<Book>>(of, HttpStatus.OK);
	}
	

}
