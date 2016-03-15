package shcherbakov.sergey.onlineLibrary.service.book;

import java.util.List;

import shcherbakov.sergey.onlineLibrary.model.Book;

public interface BookService {
	public List<Book> listBooks();
	
	public void addBook(Book book);
	
	public Book getBook(Integer idBook);
	
	public List<Book> listBooksByParameters(String text, String genre);
	
	public void deleteBook(Integer idBook);
	
	public void editBook(Book book);
}
