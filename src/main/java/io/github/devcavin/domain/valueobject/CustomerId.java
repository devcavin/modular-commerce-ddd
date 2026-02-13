package io.github.devcavin.domain.valueobject;

import java.util.UUID;

public class CustomerId extends DomainId {
    protected CustomerId(UUID value) {
        super(value);
    }

    public static CustomerId newId() {
        return new CustomerId(UUID.randomUUID());
    }

    public static CustomerId of(UUID value) {
        return new CustomerId(value);
    }
}