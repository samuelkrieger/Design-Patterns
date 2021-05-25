package design.chainresponsibility.solution;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public abstract class Discount {
	
	protected Discount nextDiscount;
	
	protected Discount(Discount nextDiscount) {
		this.nextDiscount = nextDiscount;
	}

	public abstract  BigDecimal calculate(Estimate estimate);
	
	

}
