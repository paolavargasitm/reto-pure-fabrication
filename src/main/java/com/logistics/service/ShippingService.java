package com.logistics.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ShippingService {
    private final Map<String, Double> baseRates;

    public ShippingService() {
        this.baseRates = loadBaseRates();
    }

    private Map<String, Double> loadBaseRates() {
        Map<String, Double> rates = new HashMap<>();
        rates.put("domestic", 5.0);
        rates.put("international", 15.0);
        return rates;
    }

    public double calculateShippingCost(String destinationType, double weight) {
        double baseRate = baseRates.getOrDefault(destinationType, 10.0);
        return baseRate + (weight * 0.5);
    }
}