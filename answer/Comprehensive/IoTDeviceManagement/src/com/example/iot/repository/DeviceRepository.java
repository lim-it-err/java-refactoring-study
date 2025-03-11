package IoTDeviceManagement.src.com.example.iot.repository;

import com.example.iot.model.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeviceRepository {
    private final List<Device> devices = new ArrayList<>();

    public List<Device> findAll() {
        return devices.stream()
            .filter(device -> !device.getStatus().equalsIgnoreCase("deleted")) // Soft deletion
            .collect(Collectors.toList());
    }

    public void save(Device device) {
        // FIXME: No validation logic here; should we check for duplicates?
        devices.add(device);
    }

    public void delete(String deviceId) {
        devices.stream()
            .filter(device -> device.getId().equals(deviceId))
            .findFirst()
            .ifPresent(device -> device.setStatus("deleted"));
    }
}
