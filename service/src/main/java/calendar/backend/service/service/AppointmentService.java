package calendar.backend.service.service;

import calendar.backend.service.data.model.Appointment;
import calendar.backend.service.data.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<Appointment> findAppointmentsForMonth(LocalDate date) {
        return appointmentRepository.findAppointmentsForMonth(date);
    }
}
