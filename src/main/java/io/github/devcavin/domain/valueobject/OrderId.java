package io.github.devcavin.domain.valueobject;

import java.util.UUID;

public class OrderId extends DomainId {
    protected OrderId(UUID value) {
        super(value);
    }

    public static OrderId newId() {
        return new OrderId(UUID.randomUUID());
    }

    public static OrderId of(UUID value) {
        return new OrderId(value);
    }
}