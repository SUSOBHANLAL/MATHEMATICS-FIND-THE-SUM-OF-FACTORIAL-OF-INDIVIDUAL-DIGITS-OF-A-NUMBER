package sumofFACTofAdigit;

public class susobhan {
	
	public static void main(String args[]) {
		int num = 145;
		
		if(num==last(num)) {
			System.out.print("yes");
		}else {
			System.out.print("no");

		}
		
		
	}
	public static  int last(int num ) {
		int dig =0;
		int fact =1;
		int sum =0;
		while(num>0) {
			 dig = num%10;
			 
			 //System.out.println(dig);
			 //make fact for 5
			 fact = 1;
			 for(int i= dig;i>=1;i--) {
				 fact = fact *i;
			 }
			 //System.out.print("fact"+fact);
			num = num/10;
			sum+=fact;
			
		}
		return sum;
	}
	
	

}
