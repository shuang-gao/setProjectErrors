package model;
public class Party {

	private String name;
	private float projectedNumberOfSeats;
	private float projectedPercentageOfVotes;
	
	
	
	// Constructors:
	public Party(String partyName) {
	    name = partyName;
	}
	
	
	public Party(String partyName, float seats, float percentofvotes) {
		name = partyName;
	        projectedNumberOfSeats = seats;
		//if(percentofvotes>=0 && percentofvotes <=1) {
		    projectedPercentageOfVotes = percentofvotes;
		
	}
	
	
	//a getter takes no parameter, and returns the parameter within the object;
	
		public float getProjectedPercentageOfVotes() { 
			return this.projectedPercentageOfVotes;
		}  //Get the percentage of votes;
		
		
		
		
		
		
		public String getName() {
			if(name== null) {
				return null;
			}
			else {
			return this.name;
		} // Get the name of the party;
		}
		
		
		
		
		// Compute the projected percentage of votes:

		public void setProjectedPercentageOfVotes(float percentofvotes) {
			
			if (percentofvotes<0 || percentofvotes>1) // If the percentage goes out of the range:
			{System.out.println("The percentage of votes must be between 0 and 1.");}//give an error message;
			else {
			projectedPercentageOfVotes = percentofvotes;}
		}  
		
		
		
		
		

		public float getProjectedNumberOfSeats() {
			
			return projectedNumberOfSeats;
		}

		
		
		
		
		public void setProjectedNumberOfSeats(float numofseats) {
			if(numofseats <0) 
			{System.out.println("The number of seats must be a non-negative number.");}
			
			//If the number of seats goes out of range: give an error message;
			else {
			projectedNumberOfSeats = numofseats;}
		}

	
	
	
	
	//a getter takes no parameter, and returns the parameter within the object;
	
	
	
	
	
	
	

	
	
	// Compute the projected percentage of votes:

	//public void setProjectedPercentageOfVotes(float projectedPercentageOfVotes) {
		
		//if (projectedPercentageOfVotes<0 || projectedPercentageOfVotes>1) // If the percentage goes out of the range:
	//	{System.out.println("The percentage of votes must be between 0 and 1.");}//give an error message;
	//	else {
	//	percent = projectedPercentageOfVotes;}
	//}  
	
	
	
	
	


	
	
	
	
	
	
	
	@Override
	public String toString() {
		return name + " (" + projectedPercentageOfVotes*100 + "% " + projectedNumberOfSeats + ")";
	}
	
	
	
	
	public double projectedPercentOfSeats(int totalNumberOfSeats) {
		return (double)projectedNumberOfSeats/totalNumberOfSeats ;
	}
	
	
	
	
	public String textVisualizationBySeats(int maxStars, int starsNeededForMajority, double numOfSeatsPerStar) {

		
		String rep = byboth(maxStars,starsNeededForMajority,numOfSeatsPerStar,projectedNumberOfSeats);
		
		return rep +toString();
	}
	
	
	
	
	

	public String textVisualizationByVotes(int maxStars, int starsNeededForMajority, double percentOfVotesPerStar) {
		String rep = byboth(maxStars,starsNeededForMajority,percentOfVotesPerStar,projectedPercentageOfVotes*100);
		return  rep + toString();
	}
	
	
	
	
	
	//This is a function that is used by both textVisualizationByVotes and textVisualizationBySeats above;
	private String byboth(int maxStars,int starsNeededForMajority,double amountPerStar, float amount) {
		double x = (double)amount/amountPerStar;
		int n;
		
		
		if(x - (int)x ==0) {n = (int)x;}  //If the amount is divisible by the amountPerStar:
		                                  // then n is assigned the value (int)x;
		
		else {n = (int)x+1;}              // If the amount is not divisible by the amountPerStar,
		                                  // then x is rounded up to an integer which assigns to n.
		
		String rep = new String();                       // Initiate a string variable;
		
		
		//if they don't get enough stars for majority:
                    if( n < starsNeededForMajority) 
                    {
        	            rep = "*".repeat(n) + " ".repeat(starsNeededForMajority-n)+ "|";
                    }
        
           
                 // if they  get enough stars for majority:
                     else { 
                        rep = "*".repeat(starsNeededForMajority) +"|" +"*".repeat(n-starsNeededForMajority);
                            }
        
        
		     String s = new String("     ");
		     return rep + s;
		
	          }
	
	 //Main method, for testing:
	public static void main(String[] args) {
		Party p = new Party("Party1", (float)50.0, (float)0.4);
		double percentOfSeats = p.projectedPercentOfSeats(100);
		System.out.println("Party with 50 seats and total 100 seats, expected percent should be 0.5, it actually was: " + percentOfSeats);
	    Party p2 = new Party("Party2", (float)190, (float).53);
		System.out.println(p2.textVisualizationByVotes(20, 10, 18.0));
	    
	
	}
	

	

}