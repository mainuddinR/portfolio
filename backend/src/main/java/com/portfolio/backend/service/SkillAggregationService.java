package com.portfolio.backend.service;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SkillAggregationService {
    public List<String> aggregateSkills() {
        return List.of("Java", "Angular", "Spring Boot");
    }
}