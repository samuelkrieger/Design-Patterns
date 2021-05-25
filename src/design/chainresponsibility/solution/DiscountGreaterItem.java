package design.chainresponsibility.solution;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public class DiscountGreaterItem extends Discount {
	
	public DiscountGreaterItem(Discount nextDiscount) {
		super(nextDiscount);
		
	}
	public BigDecimal calculate(Estimate estimate) {
		if(estimate.getQuantity() > 5) {
			return estimate.getValue().multiply(new BigDecimal("0.1"));
		}
		return nextDiscount.calculate(estimate);
		
	}
}
