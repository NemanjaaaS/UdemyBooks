package nemanja.spring.udemyPractice.repositories;

import nemanja.spring.udemyPractice.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
