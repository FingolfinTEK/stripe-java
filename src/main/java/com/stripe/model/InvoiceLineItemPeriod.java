package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class InvoiceLineItemPeriod extends StripeObject {
	Long end;
	Long start;
}
