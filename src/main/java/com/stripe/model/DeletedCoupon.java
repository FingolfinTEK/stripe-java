package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class DeletedCoupon extends StripeObject implements DeletedStripeObject {
	String id;
	Boolean deleted;
}
