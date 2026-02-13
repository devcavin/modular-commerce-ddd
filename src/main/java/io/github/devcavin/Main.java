package io.github.devcavin;

import io.github.devcavin.domain.customers.Customer;
import io.github.devcavin.domain.valueobject.CustomerId;
import io.github.devcavin.domain.valueobject.EmailObject;
import io.github.devcavin.domain.valueobject.NameObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("modular-commerce-ddd");

        Customer customer = new Customer(
                CustomerId.newId(),
                new EmailObject("t@test.com"),
                new NameObject("Test")
        );

        System.out.println("Customer id is: " + customer.getId());
        System.out.println("Customer email is: " + customer.getEmail());
        System.out.println("Customer name is " + customer.getName());
    }
}