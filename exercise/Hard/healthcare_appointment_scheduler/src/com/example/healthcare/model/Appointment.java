package healthcare_appointment_scheduler.src.com.example.healthcare.model;

import java.time.LocalDateTime;

public class Appointment {
    private final String patientId;
    private final String doctorId;
    private final LocalDateTime time;

    public Appointment(String patientId, String doctorId, LocalDateTime time) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.time = time;
    }

    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public LocalDateTime getTime() { return time; }
}
