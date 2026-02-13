package io.github.devcavin.domain.valueobject;

import java.util.Objects;
import java.util.UUID;

public abstract class DomainId {
    private final UUID value;

    protected DomainId(UUID value) {
       this.value = Objects.requireNonNull(value, "Id cannot be null");
    }

    public UUID value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainId domainId = (DomainId) o;
        return value.equals(domainId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
