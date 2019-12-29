package calendar.backend.service.calendarbackendservice.user.repository;

import calendar.backend.service.calendarbackendservice.user.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
