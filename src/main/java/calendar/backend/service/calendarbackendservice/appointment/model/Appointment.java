package calendar.backend.service.calendarbackendservice.appointment.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
public class Appointment {

    private static final String PROPERTY_START_DATE = "startDate";
    private static final String PROPERTY_END_DATE = "endDate";

    @Id
    private String id;

    @Field(PROPERTY_START_DATE)
    private Date startDate;

    @Field(PROPERTY_END_DATE)
    private Date endDate;
}
