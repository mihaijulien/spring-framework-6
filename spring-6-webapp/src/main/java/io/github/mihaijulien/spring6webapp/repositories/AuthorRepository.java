package io.github.mihaijulien.spring6webapp.repositories;

import io.github.mihaijulien.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
