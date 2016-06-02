package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class TransferTransaction extends StripeObject implements HasId {
	String id;
	Long amount;
	Long net;
	String type;
	Long created;
	String description;
	Long fee;
}
