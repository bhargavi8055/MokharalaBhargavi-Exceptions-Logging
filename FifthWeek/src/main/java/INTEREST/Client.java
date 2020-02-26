package INTEREST;


import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

	public static void main(String args[])  {
		
		Scanner scan=new Scanner(System.in);
		final Logger logger=LogManager.getLogger(Client.class);
		
		while(true) {
			
			try {
				logger.info("Enter choice\n1.SimpleInterest\n2.CompoundInterest");
				String choice1=scan.next();
				int choice=Integer.parseInt(choice1);
				
				if(choice!=1&&choice!=2) {
					logger.warn("...please enter valid choices given in menu...");
					continue;
				}
				
				logger.info("Enter principle amount:");
				String principleamount1=scan.next();
				float principleamount=Float.parseFloat(principleamount1);
				
				logger.info("Enter rateofinterest:");
				String rateofinterst1=scan.next();
				float rateofinterest=Float.parseFloat(rateofinterst1);
				
				logger.info("Enter time:");
				String time1=scan.next();
				float time=Float.parseFloat(time1);
				
				if (choice==1) {
					Simpleinterest Si=new Simpleinterest();
					double si=Si.Calculate(principleamount,rateofinterest,time);
					logger.info("**********Simple Interest :Rs."+si+"**********");
					break;
				}
				else if(choice==2) {
					CompoundInterest Ci=new CompoundInterest();
					double ci=Ci.Calculate(principleamount,rateofinterest,time);
					logger.info("**********Compound Interest :Rs."+ci+"**********");
					break;
				}
		
			}
			catch(Exception e) {
				logger.info("....enter values in numbers only...");
			}
		}
		scan.close();
	}
}
