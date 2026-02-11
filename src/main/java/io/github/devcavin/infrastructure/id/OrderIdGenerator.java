package io.github.devcavin.infrastructure.id;

import io.github.devcavin.application.common.IdGenerator;
import io.github.devcavin.domain.OrderId;

import java.util.UUID;

public class OrderIdGenerator implements IdGenerator<OrderId> {
    @Override
    public OrderId generate() {
        return new OrderId(UUID.randomUUID());
    }
}
