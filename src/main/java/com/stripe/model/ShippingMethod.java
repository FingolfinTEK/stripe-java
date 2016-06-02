package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class ShippingMethod extends StripeObject {
	String id;
	Integer amount;
	String currency;
	String description;
}
