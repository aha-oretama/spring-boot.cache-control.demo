package api.aha.oretama.jp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import api.aha.oretama.jp.model.Book;

@RestController
public class BookController {

	@RequestMapping(path = "api/v1/books", method = RequestMethod.GET)
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			Book book = new Book("isbn" + String.valueOf(i), "title" + String.valueOf(i), "author" + String.valueOf(i));
			books.add(book);
		}

		return books;
	}

}
