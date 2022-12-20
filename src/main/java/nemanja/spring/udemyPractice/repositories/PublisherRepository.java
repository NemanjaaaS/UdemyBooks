package nemanja.spring.udemyPractice.repositories;

import nemanja.spring.udemyPractice.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
