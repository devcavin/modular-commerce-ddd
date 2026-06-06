package io.github.devcavin.domain.valueobject;

import java.util.Objects;

public record Title(String value) {
    public Title(String value) {
        Objects.requireNonNull(value, "Title cannot be null");

        String titleNormalized = value.trim().toLowerCase();
        if (titleNormalized.isBlank()) throw new IllegalArgumentException("Title cannot be blank");

        this.value = titleNormalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return value.equals(title.value);
    }

    @Override
    public String toString() {
        return value;
    }
}
