package api.aha.oretama.jp.model;

import lombok.Value;

@Value
public class Book {
	private String isbn;
	private String title;
	private String author;
}
