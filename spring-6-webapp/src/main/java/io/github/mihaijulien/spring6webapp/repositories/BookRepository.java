package io.github.mihaijulien.spring6webapp.repositories;

import io.github.mihaijulien.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
