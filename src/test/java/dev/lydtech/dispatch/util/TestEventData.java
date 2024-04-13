package dev.lydtech.dispatch.util;

import dev.lydtech.dispatch.message.OrderCreated;

import java.util.UUID;

public class TestEventData {    // utility class test event data which provides us with a static method to build order created event (POJO mapped from JSON)

    public static OrderCreated buildOrderCreatedEvent(UUID orderId, String item) {  // static method to build order created event (POJO mapped from JSON) - takes values and assign them to POJO
        return OrderCreated.builder()
                .orderId(orderId)
                .item(item)
                .build();
    }
}
