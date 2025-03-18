package com.logistics.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingServiceTest {
    @Test
    public void testCalculateShippingCost() {
        ShippingService service = new ShippingService();
        assertEquals(10.0, service.calculateShippingCost("domestic", 10));
        assertEquals(20.0, service.calculateShippingCost("international", 10));
        assertEquals(15.0, service.calculateShippingCost("unknown", 10));
    }
}