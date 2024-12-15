package calendar.backend.service.service;

import calendar.backend.service.data.repository.UserRepository;
import calendar.backend.service.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User fetchUser(final String userId) {
        return this.userRepository
                .findById(userId)
                .orElse(new User());
    }
}
