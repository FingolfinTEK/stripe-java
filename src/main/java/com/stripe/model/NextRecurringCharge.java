package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class NextRecurringCharge extends StripeObject {
	Integer amount;
	String date;
}
