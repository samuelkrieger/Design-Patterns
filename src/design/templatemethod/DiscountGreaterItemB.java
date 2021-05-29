package design.templatemethod;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public class DiscountGreaterItemB extends Discount {
	
	public DiscountGreaterItemB(Discount nextDiscount) {
		super(nextDiscount);
		
	}

	@Override
	public boolean mustbeapplied(Estimate estimate) {
		return estimate.getQuantity()>500;
	}
	
	
	
	@Override
	public BigDecimal accomplishcalculate(Estimate estimate) {
		return estimate.getValue().multiply(new BigDecimal("0.2"));
	}




}
