package calendar.backend.service.data.repository;

import calendar.backend.service.data.model.CalendarDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface CalendarDayRepository extends JpaRepository<CalendarDay, Long> {

    @Query("""
            SELECT d
            FROM CALENDAR_DAY d
            WHERE MONTH(d.startDate) = MONTH(:startDate) AND YEAR(d.startDate) = YEAR(:startDate)""")
    List<CalendarDay> findDaysWithDataForMonth(@Param("startDate") LocalDate startDate);

    @Query(value = "SELECT CALENDAR_DAY_SEQUENCE.NEXTVAL FROM dual", nativeQuery = true)
    Long getNextSequenceValue();
}
