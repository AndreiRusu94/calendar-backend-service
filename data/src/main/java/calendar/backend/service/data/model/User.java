package calendar.backend.service.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {

    @Id
    private String id;

    private String name;

    private List<Appointment> appointments;

    public User() {
    }

    public User(final String userId) {
        this.id = userId;
    }

}
