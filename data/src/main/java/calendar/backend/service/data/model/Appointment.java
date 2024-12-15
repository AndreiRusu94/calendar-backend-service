package calendar.backend.service.data.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
public class Appointment {

    @Id
    private String id;

    private Date startDate;

    private Date endDate;
}
