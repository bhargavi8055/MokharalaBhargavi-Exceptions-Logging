package INTEREST;

public class CompoundInterest {

	double Calculate(float p,float r,float t ) {
	
		double amount=p*Math.pow(1+r/100, t);
		return amount;
		
	}
}
