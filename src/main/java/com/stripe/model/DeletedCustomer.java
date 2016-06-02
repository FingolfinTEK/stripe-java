package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class DeletedCustomer extends StripeObject implements DeletedStripeObject {
	String id;
	Boolean deleted;
}
