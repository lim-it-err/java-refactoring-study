package IoTDeviceManagement.src.com.example.iot.service;

import com.example.iot.model.Device;
import IoTDeviceManagement.src.com.example.iot.repository.DeviceRepository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService() {
        this.deviceRepository = new DeviceRepository();
    }

    public List<Device> getAllDevices() {
        // FIXME: This method blocks the main thread; should be converted to async
        return deviceRepository.findAll();
    }

    public CompletableFuture<Void> initializeDevicesAsync() {
        return CompletableFuture.runAsync(() -> {
            // TODO: Implement proper async initialization
            System.out.println("Initializing devices...");
        });
    }
}
