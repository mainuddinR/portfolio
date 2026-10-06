package com.portfolio.backend.service;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ExperienceTimelineService {
    public List<String> getTimeline() {
        return List.of("Job A", "Job B");
    }
}