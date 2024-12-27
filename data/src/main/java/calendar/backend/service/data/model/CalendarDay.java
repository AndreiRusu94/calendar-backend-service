package calendar.backend.service.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity(name = "CALENDAR_DAY")
public class CalendarDay {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany
    private List<Appointment> appointments;

    @Column(name = "crossed_off")
    private Boolean isCrossedOff;

    @Column(name = "start_date")
    private LocalDate startDate;
}
