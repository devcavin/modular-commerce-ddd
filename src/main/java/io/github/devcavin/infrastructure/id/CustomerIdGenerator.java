package io.github.devcavin.infrastructure.id;

import io.github.devcavin.application.common.IdGenerator;
import io.github.devcavin.domain.CustomerId;

import java.util.UUID;

public class CustomerIdGenerator implements IdGenerator<CustomerId> {
    @Override
    public CustomerId generate() {
        return new CustomerId(UUID.randomUUID());
    }
}
