package io.github.devcavin.domain;

import io.github.devcavin.domain.shared.DomainId;

import java.util.UUID;

public class CustomerId implements DomainId {
    private final UUID id;

    public CustomerId(UUID id) {
        this.id = id;
    }

    @Override
    public UUID value() {
        return id;
    }
}
