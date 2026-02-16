package io.github.devcavin.domain.customers;

import io.github.devcavin.domain.valueobject.CustomerId;
import io.github.devcavin.domain.valueobject.Email;
import io.github.devcavin.domain.valueobject.Name;

import java.util.Objects;

public class Customer {

    private final CustomerId id;
    private Email email;
    private Name name;

    public Customer(CustomerId id, Email email, Name name) {
        this.id = Objects.requireNonNull(id);
        this.email = Objects.requireNonNull(email);
        this.name = Objects.requireNonNull(name);
    }

    public CustomerId getId() {
        return id;
    }

    public Email getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public void changeEmail(Email newEmail) {
        this.email = Objects.requireNonNull(newEmail);
    }

    public void changeName(Name newName) {
        this.name = Objects.requireNonNull(newName);
    }
}