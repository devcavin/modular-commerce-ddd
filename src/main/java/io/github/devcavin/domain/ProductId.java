package io.github.devcavin.domain;

import io.github.devcavin.domain.shared.DomainId;

import java.util.UUID;

public class ProductId implements DomainId {
    private final UUID id;

    public ProductId(UUID id) {
        this.id = id;
    }

    @Override
    public UUID value() {
        return id;
    }
}
