
package com.kgisl.sb2.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kgisl.sb2.entity.Book;
import com.kgisl.sb2.repository.BookRepository;
@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "*")
public class BookController {
    @Autowired 
    private BookRepository bookRepository;
    @GetMapping("/")
    public List<Book> getAllBooks(){
        bookRepository.findAll().forEach(System.out::println);
        return bookRepository.findAll();
    }
    @GetMapping(value = "/{id}")
    public Optional<Book> getBook(@PathVariable("id") int id){
       return bookRepository.findById(id);
    }
    @PostMapping(value = "/")
    public Book createBook(@RequestBody Book book){
        return bookRepository.save(book);
    }
    @PutMapping(value = "/{id}")  
    public void updateBook(@RequestBody Book book, int id){
        // Book book3 = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not Found"));
        // // book2.setTitle(book2.getTitle());
        // // book2.setAuthor(book2.getAuthor());
        // // book2.setPrice(book2.getPrice());
        bookRepository.save(book);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteBook(@PathVariable("id") int id){
       bookRepository.deleteById(id);
    }
}
