package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class AccountTransferSchedule extends StripeObject {
	Integer delayDays;
	String interval;
	Integer monthlyAnchor;
	String weeklyAnchor;
}
