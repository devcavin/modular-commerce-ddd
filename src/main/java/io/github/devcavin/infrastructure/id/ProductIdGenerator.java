package io.github.devcavin.infrastructure.id;

import io.github.devcavin.application.common.IdGenerator;
import io.github.devcavin.domain.ProductId;

import java.util.UUID;

public class ProductIdGenerator implements IdGenerator<ProductId> {
    @Override
    public ProductId generate() {
        return new ProductId(UUID.randomUUID());
    }
}
