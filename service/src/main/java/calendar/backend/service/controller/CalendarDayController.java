package calendar.backend.service.controller;

import calendar.backend.service.data.model.CalendarDay;
import calendar.backend.service.service.CalendarDayService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/days")
public class CalendarDayController {

    private final CalendarDayService calendarDayService;

    public CalendarDayController(CalendarDayService calendarDayService) {
        this.calendarDayService = calendarDayService;
    }

    @GetMapping
    public List<CalendarDay> getDaysWithDataForMonth(@RequestParam LocalDate date) {
        return calendarDayService.findDaysWithDataForMonth(date);
    }

    @PostMapping
    public CalendarDay updateDay(@RequestBody CalendarDay calendarDay) {
        return calendarDayService.saveDay(calendarDay);
    }

    @DeleteMapping
    public void deleteDay(@RequestParam Long id) {
        calendarDayService.deleteDay(id);
    }
}
