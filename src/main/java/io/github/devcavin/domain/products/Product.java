package io.github.devcavin.domain.products;

import io.github.devcavin.domain.valueobject.Description;
import io.github.devcavin.domain.valueobject.Money;
import io.github.devcavin.domain.valueobject.ProductId;
import io.github.devcavin.domain.valueobject.Title;

import java.util.Objects;

public class Product {
    private final ProductId id;
    private Title title;
    private Description description;
    private Money price;

    public Product(ProductId id, Title title, Description description, Money price) {
        this.id = Objects.requireNonNull(id);
        this.title = Objects.requireNonNull(title);
        this.description = Objects.requireNonNull(description);
        this.price = Objects.requireNonNull(price);
    }

    public ProductId getId() {
        return id;
    }

    public Title getTitle() {
        return title;
    }

    public Description getDescription() {
        return description;
    }

    public Money getPrice() {
        return price;
    }

    public void setTitle(Title newTitle) {
        this.title = Objects.requireNonNull(newTitle);
    }

    public void setDescription(Description newDescription) {
        this.description = Objects.requireNonNull(newDescription);
    }

    public void setPrice(Money newPrice) {
        this.price = Objects.requireNonNull(newPrice);
    }
}
