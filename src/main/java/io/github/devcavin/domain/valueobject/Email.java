package io.github.devcavin.domain.valueobject;

import java.util.Objects;
import java.util.regex.Pattern;

public record Email(String value) {

    private static final Pattern EMAIL_REGEX =
            Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,}$");

    public Email(String value) {
        Objects.requireNonNull(value, "Email cannot be null");

        String normalized = value.trim().toLowerCase();

        if (normalized.isBlank() || !EMAIL_REGEX.matcher(normalized).matches()) {
            throw new IllegalArgumentException("Invalid email format");
        }

        this.value = normalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;
        return value.equals(email.value);
    }

    @Override
    public String toString() {
        return value;
    }
}
