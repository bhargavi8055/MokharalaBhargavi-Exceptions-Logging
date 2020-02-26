package HouseConstruction;


import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger=LogManager.getLogger(Client.class);
		Construction construction=new Construction();
		Scanner scan=new Scanner(System.in);
		int choice;
		 

    // log messages using log(Level level, String msg) 
    
    
		
		while(true) {
			
			try {
				
				logger.info("Enter choice of Material Type:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
				
				String choice2=scan.next();
				choice=Integer.parseInt(choice2);
				
				if(choice>3 || choice<1) {
					logger.info(".....please look at choices numbers....");
					continue;
				}
				String choice1="";
				double Cost;
				
				if(choice==3) {
					do{
						if (choice==3) {
							logger.info("Do you want fully automated home?(yes/no):\n");
							choice1=scan.next();
						}
						if(!choice1.equals("yes") && !choice1.contentEquals("no") ){
							logger.info("......You have to enter either yes or no..... ");
							continue;
						}
						break;
					}while(true);
				}
				
				logger.info("Area of House (in square feet):");
				String area1=scan.next();
				double area=Double.parseDouble(area1);
				
				if(choice==3) {
					Cost=construction.calculate( choice,choice1,area);
				}
				else {
					Cost=construction.calculate( choice,area);
				}
				
				logger.info("**********cost needed to build is:Rs."+Cost+"    **********");
				break;
		
			}
			catch(Exception e) {
				logger.info("...Please enter a input in numbers only ...");
			}

		}
		scan.close();
	}
}
