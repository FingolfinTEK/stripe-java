package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class OrderItem extends StripeObject {
	Integer amount;
	String currency;
	String description;
	String parent;
	Integer quantity;
	String type;
}
