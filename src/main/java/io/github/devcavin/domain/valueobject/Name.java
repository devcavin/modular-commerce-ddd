package io.github.devcavin.domain.valueobject;

import java.util.Objects;

public record Name(String value) {

    public Name(String value) {
        Objects.requireNonNull(value, "Name cannot be null");

        String normalized = value.trim();
        if (normalized.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        this.value = normalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name that = (Name) o;
        return value.equals(that.value);
    }

    @Override
    public String toString() {
        return value;
    }
}
