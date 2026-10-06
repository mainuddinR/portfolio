package com.portfolio.backend.service;
import org.springframework.stereotype.Service;
@Service
public class CaseStudyService {
    public String getCaseStudy(String id) {
        return "Case study " + id;
    }
}