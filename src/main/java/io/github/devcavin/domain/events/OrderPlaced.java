package io.github.devcavin.domain.events;

import io.github.devcavin.domain.CustomerId;
import io.github.devcavin.domain.OrderId;
import io.github.devcavin.domain.valueobject.OrderItem;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class OrderPlaced implements DomainEvent {
    private final OrderId orderId;
    private final CustomerId customerId;
    private final List<OrderItem> orderItems;
    private final Instant occurredAt;

    public OrderPlaced(OrderId orderId, CustomerId customerId, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderItems = new ArrayList<>(orderItems);
        this.occurredAt = Instant.now();
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Instant getOccurredAt() {
        return occurredAt;
    }

    @Override
    public Instant occurredAt() {
        return occurredAt;
    }
}
