package calendar.backend.service.data.repository;

import calendar.backend.service.data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
}
