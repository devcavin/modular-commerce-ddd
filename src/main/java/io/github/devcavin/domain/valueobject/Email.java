package io.github.devcavin.domain.valueobject;

import java.util.Objects;
import java.util.regex.Pattern;

public final class Email {

    private static final Pattern EMAIL_REGEX =
            Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,}$");

    private final String value;

    public Email(String value) {
        Objects.requireNonNull(value, "Email cannot be null");

        String normalized = value.trim().toLowerCase();

        if (normalized.isBlank() || !EMAIL_REGEX.matcher(normalized).matches()) {
            throw new IllegalArgumentException("Invalid email format");
        }

        this.value = normalized;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;
        return value.equals(email.value);
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
