package calendar.backend.service.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Appointment {

    @Id
    private String id;

    private Date startDate;

    private Date endDate;
}
