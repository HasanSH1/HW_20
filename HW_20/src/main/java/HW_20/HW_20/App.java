package HW_20.HW_20;

/**
 * HASAN SHRKAWE 212148670
 * HAMZE MAREI 211841291
 */
public class App {
	
	
	public String calc_roots(int a,int b,int c) {
			String output="";
			if ((a<5) || (200<a) || (b<5) || (200<b)||  (c<5) || (200<c)){
				output= "numbers not in range  ";
				return output;
			}
			double determinant= b*b-4*a*c;
			if (a==0) {
				output="No quadratic equation";
						return output;}
			
			if(determinant<0) {
				output=" No Roots";
				return output;
			}	
			else if (determinant==0) {
				output="One root Roots ";
				return output;
				
			}
			
			output="Two roots ";
			return output;
				
			

		}
       
    
}
