package calendar.backend.service.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

import static calendar.backend.service.data.model.User.USER_COLLECTION;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Document(collection = USER_COLLECTION)
public class User {

    public static final String USER_COLLECTION = "userData";

    private static final String PROPERTY_NAME = "name";
    private static final String PROPERTY_APPOINTMENT = "appointment";

    @Id
    private String id;

    @Field(PROPERTY_NAME)
    private String name;

    @Field(PROPERTY_APPOINTMENT)
    private List<Appointment> appointments;

    public User() {
    }

    public User(final String userId) {
        this.id = userId;
    }

}
