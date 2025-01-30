package healthcare_appointment_scheduler.src.com.example.healthcare;

import com.example.healthcare.service.AppointmentService;

public class HealthcareScheduler {
    public static void main(String[] args) {
        AppointmentService appointmentService = new AppointmentService();

        // FIXME: Appointment times overlap due to poor scheduling logic
        appointmentService.scheduleAppointment("PATIENT123", "DOCTOR_A", "2024-06-01T10:00:00");
        appointmentService.scheduleAppointment("PATIENT456", "DOCTOR_A", "2024-06-01T10:15:00");

        System.out.println("Healthcare Appointment Scheduler Running...");
    }
}
