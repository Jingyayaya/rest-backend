package edu.baylor.cs.se.hibernate.data;

import edu.baylor.cs.se.hibernate.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPublished(boolean published);
    List<Book> findByTitleContaining(String title);
    Optional<Book> findById(long id);
    @Transactional
    void deleteById(Long id);
    @Transactional
    void deleteAll();
}
