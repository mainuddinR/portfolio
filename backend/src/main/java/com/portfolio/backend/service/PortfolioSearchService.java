package com.portfolio.backend.service;
import org.springframework.stereotype.Service;
@Service
public class PortfolioSearchService {
    public String search(String query) {
        return "Search result for " + query;
    }
}