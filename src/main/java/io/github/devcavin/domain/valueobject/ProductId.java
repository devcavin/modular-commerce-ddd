package io.github.devcavin.domain.valueobject;

import java.util.UUID;

public class ProductId extends DomainId {
    protected ProductId(UUID value) {
        super(value);
    }

    public static ProductId newId() {
        return new ProductId(UUID.randomUUID());
    }

    public static ProductId of(UUID value) {
        return new ProductId(value);
    }
}
