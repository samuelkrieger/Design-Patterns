package design.templatemethod;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

/*The Template Method is a behavioral 
 *design pattern that defines the skeleton
 *of an algorithm in the superclass but lets 
 *subclasses override specific steps of the 
 *algorithm without modifying its structure.
 */
public abstract class Discount {
	
	protected Discount nextDiscount;
	
	protected Discount(Discount nextDiscount) {
		this.nextDiscount = nextDiscount;
	}
	/*The Template Method
	 *pattern favors the reuse of common codes 
	 *between classes, thus avoiding code duplication.
	 */
	public BigDecimal calculate(Estimate estimate) {
		if(mustbeapplied(estimate)) {
			return accomplishcalculate(estimate);
		}
		return nextDiscount.calculate(estimate);
		
	}

	public abstract  BigDecimal accomplishcalculate(Estimate estimate);
	
	public abstract boolean mustbeapplied(Estimate estimate);
	
	

}
