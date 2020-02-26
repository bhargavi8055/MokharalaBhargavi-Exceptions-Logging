
package HouseConstruction;



public class Construction {
	
	public double calculate(int choice,String choice1,double area) {
		int[] cost= {1200,1500,1800,2500};
		if(choice==3) {
			
			if(choice1.equals("yes")) {
		
				return cost[3]*area;
			}
			else 
			{
				return cost[2]*area;
			}
		}
		
		return 0;
	}
	public double calculate(int choice,double area ) {
		int[] cost= {1200,1500,1800,2500};
				
				return cost[choice-1]*area;
				
		
	}
}
	

