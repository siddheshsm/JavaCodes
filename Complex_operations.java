import java.util.Scanner;
public class Complex_operations{

	public static void main(String[] args) {
		int ch =0;
		float a, b, ans;
		Scanner sc = new Scanner(System.in);
		complex_op ob = new complex_op();
		
		System.out.println("Enter First Number :");
		System.out.println("Real Part: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		complex_op obj1 = new complex_op(a,b);
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		complex_op obj2 = new complex_op(a,b);
		
		
		
		do {
			System.out.println("1.ADD");
			System.out.println("2.SUB");
			System.out.println("3.MUL");
			System.out.println("4.DIV");
			ch = sc.nextInt();
			
			switch(ch){
			
			case 1 : ob.Add(obj1,obj2);
			        break;
			        
			case 2 : ob.Sub(obj1,obj2);
			        break;
			        
			case 3 : ob.Mul(obj1,obj2);
			        break;
			        
			case 4 : ob.Div(obj1,obj2);
			        break;
			        
			case 5 : break;
			       
			}
		}while(ch<=5);
		
		

	}

}

class complex_op{
	private float c1,c2;
	complex_op(){
		c1 = 0;
		c2 = 0;
	}
	complex_op(float a, float b){
		c1 = a;
		c2 = b;
	}
	
    void Add(complex_op a , complex_op b) {
    	float c1, c2;
    	c1 = a.c1 +b.c1;
    	c2 = a.c2 + b.c2;
    	System.out.println("SUM: " + c1+ "+" + c2 +"i");
    }
    
    void Sub(complex_op a , complex_op b) {
    	float c1, c2;
    	c1 = a.c1 - b.c1;
    	c2 = a.c2 - b.c2;
    	System.out.println("DIFF: " + c1+ "+" + c2 +"i");
    }
    
    void Mul(complex_op a , complex_op b) {
    	float c1, c2;
    	c1 = ((a.c1*b.c1) - (a.c2*b.c2));
    	c2 = ((a.c1*b.c2) - (a.c2*b.c1));
    	System.out.println("SUM: " + c1+ "+" + c2 +"i");
    }
    
    void Div(complex_op a , complex_op b) {
    	c1 = ((a.c1*b.c1) + (a.c2*b.c2))/((a.c2*a.c2) + (b.c2*b.c2));
    	c2 = ((a.c2*b.c1) - (b.c2*a.c1))/((a.c2*a.c2) + (b.c2*b.c2));
    	System.out.println("SUM: " + c1+ "+" + c2 +"i");
    }
	
}
