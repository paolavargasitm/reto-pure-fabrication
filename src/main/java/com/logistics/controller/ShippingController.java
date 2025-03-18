package com.logistics.controller;

import com.logistics.service.ShippingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping("/cost")
    public double getShippingCost(@RequestParam String destinationType, @RequestParam double weight) {
        return shippingService.calculateShippingCost(destinationType, weight);
    }
}