package calendar.backend.service.data.repository;

import calendar.backend.service.data.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, String> {

    @Query("""
            SELECT a
            FROM Appointment a
            WHERE MONTH(a.startTime) = MONTH(:startTime) AND YEAR(a.startTime) = YEAR(:startTime)""")
    List<Appointment> findAppointmentsForMonth(@Param("startTime") LocalDate startTime);

}
