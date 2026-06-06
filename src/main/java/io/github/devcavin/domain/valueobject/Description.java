package io.github.devcavin.domain.valueobject;

import java.util.Objects;

public record Description(String value) {
    public Description(String value) {
        Objects.requireNonNull(value, "Description must not be null");
        String normalized = value.trim().toLowerCase();
        if (normalized.isBlank()) {
            throw new IllegalArgumentException("Description must not be blank");
        }
        this.value = normalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Description that = (Description) o;
        return value.equals(that.value);
    }

    @Override
    public String toString() {
        return value;
    }
}
