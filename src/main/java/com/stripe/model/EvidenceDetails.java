package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public final class EvidenceDetails extends StripeObject {
	protected Long dueBy;
	protected Integer submissionCount;
}
