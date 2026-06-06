package io.github.devcavin.domain.orders;

import io.github.devcavin.domain.products.Product;
import io.github.devcavin.domain.valueobject.CustomerId;
import io.github.devcavin.domain.valueobject.Description;
import io.github.devcavin.domain.valueobject.OrderId;
import io.github.devcavin.domain.valueobject.Title;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final OrderId orderId;
    private final Title orderTitle;
    private final CustomerId  customerId;
    private final Description orderDescription;
    private final List<Product> products;
    private final BigDecimal totalPrice;


    public Order(OrderId orderId, Title orderTitle, CustomerId customerId, Description orderDescription,
                 List<Product> products, BigDecimal totalPrice, BigDecimal totalPrice1) {
        this.orderId = orderId;
        this.orderTitle = orderTitle;
        this.customerId = customerId;
        this.orderDescription = orderDescription;
        this.products = products;
        this.totalPrice = getTotalPrice();
    }

   private BigDecimal getTotalPrice() {
        if (products == null || products.isEmpty()) {
            return BigDecimal.ZERO;
        }
       BigDecimal total = products
   }
}
