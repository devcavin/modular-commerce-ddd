package io.github.devcavin.domain.valueobject;

import java.util.Objects;

public class Description {
    private final String value;

    public Description(String value) {
        Objects.requireNonNull(value, "Description must not be null");
        String normalized = value.trim().toLowerCase();
        if (normalized.isBlank()) {
            throw new IllegalArgumentException("Description must not be blank");
        }
        this.value = normalized;
    }

    public String value() {
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
        Description that = (Description) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
