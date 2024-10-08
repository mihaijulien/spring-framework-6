package io.github.mihaijulien.spring6webapp.bootstrap;

import io.github.mihaijulien.spring6webapp.domain.Author;
import io.github.mihaijulien.spring6webapp.domain.Book;
import io.github.mihaijulien.spring6webapp.domain.Publisher;
import io.github.mihaijulien.spring6webapp.repositories.AuthorRepository;
import io.github.mihaijulien.spring6webapp.repositories.BookRepository;
import io.github.mihaijulien.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


// @Component is a Spring Stereotype -> Spring uses component scanning to find classes annotated with @Component (and
// annotations like @Service @Repository @Controller)
// and register them as beans (instances of the classes) in the Spring container


// CommandLineRunner
// tells SpringBoot that when it boots and detects this type of component in the classpath or context,
// take it and execute the run method
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    // will run every time SpringBoot starts up
    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("4723842379");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        // Associations between authors and books
        // This instruction gives an error if we do not initialize the Set in the Book and Author class, because we have id, but
        // Book is null, and we get a NullPointerException error
        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("My Publisher");
        publisher.setAddress("123 Main");
        Publisher savedPublisher = publisherRepository.save(publisher);

        dddSaved.setPublisher(savedPublisher);
        noEJB.setPublisher(savedPublisher);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
