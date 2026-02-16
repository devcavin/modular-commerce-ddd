package io.github.devcavin.domain.valueobject;

import java.math.BigDecimal;
import java.util.Objects;

public record Money(BigDecimal value) {
    public Money {
        Objects.requireNonNull(value, "Price must not be null");
        // I will consider free goods and promotions
        if (value.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("Price must not be negative");
    }

    public Money add(Money other) {
        return new Money(value.add(other.value));
    }

    public Money multiply(int quantity) {
        return new Money(value.multiply(BigDecimal.valueOf(quantity)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return value.compareTo(money.value) == 0;
    }

    @Override
    public int hashCode() {
        return value.stripTrailingZeros().hashCode();
    }

    @Override
    public String toString() {
        return value.toPlainString();
    }
}
