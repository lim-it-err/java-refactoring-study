package com.example.logistics.service;

import com.example.logistics.repository.TrackingRepository;

public class TrackingService {
    private TrackingRepository trackingRepository = new TrackingRepository();

    public void trackShipment(String shipmentId) {
        // FIXME: No validation on shipment ID format
        System.out.println("Tracking shipment: " + shipmentId);
        trackingRepository.getTrackingInfo(shipmentId);
    }
}
