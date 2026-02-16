package io.github.devcavin.domain.valueobject;

import java.util.Objects;

public class Title {
    private final String value;

    public Title(String value) {
        Objects.requireNonNull(value, "Title cannot be null");

        String titleNormalized = value.trim().toLowerCase();
        if (titleNormalized.isBlank()) throw new IllegalArgumentException("Title cannot be blank");

        this.value = titleNormalized;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return value.equals(title.value);
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
