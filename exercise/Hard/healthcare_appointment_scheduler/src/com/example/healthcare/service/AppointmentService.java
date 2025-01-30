package healthcare_appointment_scheduler.src.com.example.healthcare.service;

import com.example.healthcare.model.Appointment;
import healthcare_appointment_scheduler.src.com.example.healthcare.repository.AppointmentRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentService() {
        this.appointmentRepository = new AppointmentRepository();
    }

    public void scheduleAppointment(String patientId, String doctorId, String time) {
        LocalDateTime appointmentTime = LocalDateTime.parse(time);

        // FIXME: No validation for overlapping appointments
        appointmentRepository.save(new Appointment(patientId, doctorId, appointmentTime));
    }

    public CompletableFuture<List<Appointment>> getAppointmentsAsync(String doctorId) {
        return CompletableFuture.supplyAsync(() -> appointmentRepository.findByDoctor(doctorId));
    }
}
