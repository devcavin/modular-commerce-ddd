package io.github.devcavin.application.common;

import io.github.devcavin.domain.shared.DomainId;

public interface IdGenerator<T extends DomainId> {
    T generate();
}
