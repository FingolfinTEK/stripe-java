package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public final class VerificationFields extends StripeObject {
	protected VerificationFieldsDetails individual;
	protected VerificationFieldsDetails company;
}
