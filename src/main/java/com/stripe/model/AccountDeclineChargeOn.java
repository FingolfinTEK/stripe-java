package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class AccountDeclineChargeOn extends StripeObject {
	Boolean avsFailure;
	Boolean cvcFailure;
}
