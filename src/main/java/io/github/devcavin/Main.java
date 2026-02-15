package io.github.devcavin;

import io.github.devcavin.domain.customers.Customer;
import io.github.devcavin.domain.products.Product;
import io.github.devcavin.domain.valueobject.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("modular-commerce-ddd");

        Customer customer = new Customer(
                CustomerId.newId(),
                new Email("t@test.com"),
                new Name("Test")
        );

        System.out.println("Customer id is: " + customer.getId());
        System.out.println("Customer email is: " + customer.getEmail());
        System.out.println("Customer name is " + customer.getName());

        Product product = new Product(
                ProductId.newId(),
                new Title("Product 1"),
                new Description("Product 1 description"),
                new Money(new BigDecimal("10.00"))
        );
        System.out.println("Product id is: " + product.getId());
        System.out.println("Product title is: " + product.getTitle());
        System.out.println("Product description is: " + product.getDescription());
        System.out.println("Product price is: " + product.getPrice());
    }
}