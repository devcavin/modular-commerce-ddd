package io.github.devcavin.domain.customers;

import io.github.devcavin.domain.valueobject.CustomerId;
import io.github.devcavin.domain.valueobject.EmailObject;
import io.github.devcavin.domain.valueobject.NameObject;

import java.util.Objects;

public class Customer {

    private final CustomerId id;
    private EmailObject email;
    private NameObject name;

    public Customer(CustomerId id, EmailObject email, NameObject name) {
        this.id = Objects.requireNonNull(id);
        this.email = Objects.requireNonNull(email);
        this.name = Objects.requireNonNull(name);
    }

    public CustomerId getId() {
        return id;
    }

    public EmailObject getEmail() {
        return email;
    }

    public NameObject getName() {
        return name;
    }

    public void changeEmail(EmailObject newEmail) {
        this.email = Objects.requireNonNull(newEmail);
    }

    public void changeName(NameObject newName) {
        this.name = Objects.requireNonNull(newName);
    }
}