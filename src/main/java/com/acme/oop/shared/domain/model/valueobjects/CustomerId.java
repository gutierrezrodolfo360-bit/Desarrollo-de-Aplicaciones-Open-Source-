package com.acme.oop.shared.domain.model.valueobjects;

import java.util.Objects;
import java.util.UUID;

/**
 * Represents a unique identifier for a customer.
 * @param value the UUID value of the customer ID. It must not be null.
 *
 * @author Open Source Application Development Team
 */
public record CustomerId(UUID value) {

    /**
     * Constructs a new CustomerId with the specified UUID value.
     * @param value the UUID value of the customer ID. It must not be null.
     */
    public CustomerId {
        if (Objects.isNull(value)) {
            throw new IllegalArgumentException("Customer ID cannot be null");
        }
    }

    /**
     * Constructs a new CustomerId with a randomly generated UUID value.
     */
    public CustomerId()
    {
        this(UUID.randomUUID());
    }

    /**
     * Returns the string representation of the CustomerId.
     * @return the string representation of the CustomerId value.
     */
    @Override
    public String toString() {
        return value.toString();
    }
}
