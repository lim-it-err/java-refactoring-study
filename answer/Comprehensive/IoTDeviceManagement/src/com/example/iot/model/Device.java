package IoTDeviceManagement.src.com.example.iot.model;

import java.util.UUID;

public class Device {
    private final String id;
    private String status;

    public Device() {
        this.id = UUID.randomUUID().toString();
        this.status = "Inactive"; // FIXME: Should we have different default states?
    }

    public String getId() { return id; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
