package com.example.logistics.events;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class EventDispatcher {
    private static Map<String, Consumer<String>> eventListeners = new HashMap<>();

    public void publishEvent(String eventType, String data) {
        if (eventListeners.containsKey(eventType)) {
            eventListeners.get(eventType).accept(data);
        } else {
            System.out.println("Unhandled event: " + eventType);
        }
    }

    public void registerListener(String eventType, Consumer<String> handler) {
        eventListeners.put(eventType, handler);
    }
}
