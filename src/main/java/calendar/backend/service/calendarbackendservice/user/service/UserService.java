package calendar.backend.service.calendarbackendservice.user.service;

import calendar.backend.service.calendarbackendservice.user.model.User;
import calendar.backend.service.calendarbackendservice.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User fetchUser(final String userId) {
        return this.userRepository
                .findById(userId)
                .orElse(new User(userId));
    }
}
