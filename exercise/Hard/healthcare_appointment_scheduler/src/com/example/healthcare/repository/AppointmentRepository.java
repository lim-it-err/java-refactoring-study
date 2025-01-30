package healthcare_appointment_scheduler.src.com.example.healthcare.repository;

import com.example.healthcare.model.Appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppointmentRepository {
    private final List<Appointment> appointments = new ArrayList<>();

    public List<Appointment> findByDoctor(String doctorId) {
        return appointments.stream()
            .filter(appointment -> appointment.getDoctorId().equals(doctorId))
            .collect(Collectors.toList());
    }

    public void save(Appointment appointment) {
        // FIXME: No logic to check for duplicate appointments or conflicting times
        appointments.add(appointment);
    }
}
