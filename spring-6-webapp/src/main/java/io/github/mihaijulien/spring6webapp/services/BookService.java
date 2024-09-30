package io.github.mihaijulien.spring6webapp.services;

import io.github.mihaijulien.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
