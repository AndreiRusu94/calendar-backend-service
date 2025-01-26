package calendar.backend.service.service;

import calendar.backend.service.data.model.CalendarDay;
import calendar.backend.service.data.repository.CalendarDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CalendarDayService {

    private final CalendarDayRepository calendarDayRepository;

    @Autowired
    public CalendarDayService(CalendarDayRepository calendarDayRepository) {
        this.calendarDayRepository = calendarDayRepository;
    }

    public List<CalendarDay> findDaysWithDataForMonth(LocalDate date) {
        return calendarDayRepository.findDaysWithDataForMonth(date);
    }

    public CalendarDay saveDay(CalendarDay calendarDay) {
        var day = calendarDayRepository.findById(calendarDay.getId());
        calendarDay.setId(calendarDayRepository.getNextSequenceValue());

        return day.map(calendarDayRepository::save).orElseGet(() -> calendarDayRepository.save(calendarDay));
    }
}
