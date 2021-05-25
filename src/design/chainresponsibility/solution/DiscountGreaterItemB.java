package design.chainresponsibility.solution;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public class DiscountGreaterItemB extends Discount {
	
	public DiscountGreaterItemB(Discount nextDiscount) {
		super(nextDiscount);
		
	}
	public BigDecimal calculate(Estimate estimate) {
		if(estimate.getQuantity() > 500) {
			return estimate.getValue().multiply(new BigDecimal("0.2"));
		}
		return nextDiscount.calculate(estimate);
		
	}
	

}
