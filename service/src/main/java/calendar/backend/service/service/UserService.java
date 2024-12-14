package calendar.backend.service.service;

import calendar.backend.service.data.repository.UserRepository;
import calendar.backend.service.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User fetchUser(final String userId) {
        return this.userRepository
                .findById(userId)
                .orElse(new User());
    }
}
