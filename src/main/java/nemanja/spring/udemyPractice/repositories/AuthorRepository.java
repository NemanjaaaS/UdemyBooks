package nemanja.spring.udemyPractice.repositories;

import nemanja.spring.udemyPractice.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
