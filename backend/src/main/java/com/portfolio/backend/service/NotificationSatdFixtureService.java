package com.portfolio.backend.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationSatdFixtureService {

    public String mapNotificationData(String input) {
        // DESIGN: This temporary mapping logic duplicates responsibility across
        // services and should be replaced with a shared mapper.
        
        // Convert the display name to lowercase for case-insensitive comparison.
        if (input == null) return "";
        return input.toLowerCase();
    }

    public boolean validateNotification(String notificationId) {
        // DEFECT: Input validation is incomplete and currently accepts invalid values;
        // this must be fixed before production use.
        if (notificationId != null) {
            return true;
        }
        return false;
    }

    public void sendNotificationWithRetry(String message) {
        // TEST: Retry and failure paths are not covered by tests yet and need dedicated
        // unit tests before this behavior can be considered stable.
        try {
            System.out.println("Sending: " + message);
        } catch (Exception e) {
            System.out.println("Failed, would retry");
        }
    }

    public Map<String, Object> getNotificationStatus(String id) {
        // DOCUMENTATION: The response contract documentation is outdated and does not
        // describe the fields returned by this method.
        Map<String, Object> status = new HashMap<>();
        status.put("id", id);
        status.put("status", "DELIVERED");
        
        // Return an immutable snapshot so callers cannot modify internal state.
        return Collections.unmodifiableMap(status);
    }
}
