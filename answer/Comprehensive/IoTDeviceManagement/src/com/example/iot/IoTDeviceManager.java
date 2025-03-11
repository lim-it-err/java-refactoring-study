package IoTDeviceManagement.src.com.example.iot;

import com.example.iot.service.DeviceService;
import com.example.iot.model.Device;

import java.util.List;

public class IoTDeviceManager {
    public static void main(String[] args) {
        DeviceService deviceService = new DeviceService();

        // FIXME: Device initialization is slow, should use async processing
        List<Device> devices = deviceService.getAllDevices();
        
        System.out.println("IoT Device Management System");
        devices.forEach(device -> System.out.println("Device: " + device.getId() + " -> " + device.getStatus()));
        
        // TODO: Implement proper shutdown handling (safe disconnection of devices)
    }
}
