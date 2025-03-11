package com.example.logistics.repository;

import java.util.HashMap;
import java.util.Map;

public class TrackingRepository {
    private static Map<String, String> trackingData = new HashMap<>();

    public String getTrackingInfo(String shipmentId) {
        return trackingData.getOrDefault(shipmentId, "No tracking info available");
    }

    public void updateTracking(String shipmentId, String status) {
        trackingData.put(shipmentId, status);
    }
}
