package design.templatemethod;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public class DiscountGreaterItem extends Discount {
	
	public DiscountGreaterItem(Discount nextDiscount) {
		super(nextDiscount);
		
	}


	@Override
	public boolean mustbeapplied(Estimate estimate) {
		
		return estimate.getQuantity()>5;
	}
	@Override
	public BigDecimal accomplishcalculate(Estimate estimate) {
		return estimate.getValue().multiply(new BigDecimal("0.1"));
	}
}
