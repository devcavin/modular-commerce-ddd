package io.github.devcavin.domain.events;

import java.time.Instant;

public interface DomainEvent {
    Instant occurredAt();
}
