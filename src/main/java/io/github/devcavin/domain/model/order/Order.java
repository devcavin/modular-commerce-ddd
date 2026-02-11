package io.github.devcavin.domain.model.order;

import io.github.devcavin.domain.CustomerId;
import io.github.devcavin.domain.OrderId;
import io.github.devcavin.domain.enums.OrderStatus;
import io.github.devcavin.domain.valueobject.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final OrderId id;
    private final CustomerId customerId;
    private final List<OrderItem> items;
    private final OrderStatus status;


    public Order(OrderId id, CustomerId customerId, List<OrderItem> items) {
        this.id = id;
        this.customerId = customerId;
        this.items = new ArrayList<>(items);
        this.status = OrderStatus.PLACED;
    }

    public OrderId getId() {
        return id;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderStatus getStatus() {
        return status;
    }
}
