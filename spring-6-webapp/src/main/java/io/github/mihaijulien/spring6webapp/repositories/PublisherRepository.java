package io.github.mihaijulien.spring6webapp.repositories;

import io.github.mihaijulien.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
