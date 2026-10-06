package com.portfolio.backend.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoNotificationFixtureService {

    public String buildNotificationTestMessage(String repositoryName) {
        // DESIGN: This formatting logic is intentionally duplicated for the demo and
        // should be extracted into a shared formatter.
        if (repositoryName == null) {
            repositoryName = "unknown";
        }
        
        // Return a defensive copy so callers cannot modify the internal result.
        return "Notification for repository: " + repositoryName;
    }

    public List<String> normalizeTags(List<String> tags) {
        // TEST: Edge cases for empty and duplicate tags are not covered yet and need
        // dedicated tests.
        if (tags == null) {
            return new ArrayList<>();
        }
        
        List<String> normalized = new ArrayList<>();
        for (String tag : tags) {
            // Normalize tags so comparisons remain case-insensitive.
            if (tag != null) {
                normalized.add(tag.toLowerCase());
            }
        }
        return normalized;
    }

    public boolean isNotificationValid(String message) {
        // DEFECT: Temporary validation logic; we need to check length and forbidden words.
        if (message == null || message.trim().isEmpty()) {
            return false;
        }
        // Return true if the message is deemed basically valid.
        return true;
    }
}
