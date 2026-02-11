package io.github.devcavin.domain.events;

import java.util.List;

public class OrderResult {
    private final boolean success;
    private final List<DomainEvent> events;
    private final String message;

    public OrderResult(boolean success, List<DomainEvent> events, String message) {
        this.success = success;
        this.events = events;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<DomainEvent> getEvents() {
        return events;
    }

    public String getMessage() {
        return message;
    }
}
