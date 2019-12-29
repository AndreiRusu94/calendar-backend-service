package calendar.backend.service.calendarbackendservice.user;

import calendar.backend.service.calendarbackendservice.AbstractTest;
import calendar.backend.service.calendarbackendservice.TestConfiguration;
import calendar.backend.service.calendarbackendservice.user.model.User;
import calendar.backend.service.calendarbackendservice.user.repository.UserRepository;
import calendar.backend.service.calendarbackendservice.user.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ContextConfiguration(classes = {TestConfiguration.class})
@SpringBootTest
public class UserServiceTest extends AbstractTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup() {
        User user = new User("user");
        this.userRepository.save(user);
    }

    @After
    public void delete() {
        this.userRepository.deleteAll();
    }

    @Test
    public void fetchUserTest() {
        User user = this.userService.fetchUser("user");
        assertNotNull(user);
        assertEquals("test", user.getId());
    }

}
