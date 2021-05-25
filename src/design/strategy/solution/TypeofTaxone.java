package design.strategy.solution;

import java.math.BigDecimal;

import design.strategy.Estimate;

public class TypeofTaxone {
	
	public BigDecimal calculate(Estimate estimate,Tax tax) {
		return estimate.getValue().multiply(new BigDecimal("0.1"));
	}

}
