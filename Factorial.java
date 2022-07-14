// factorial of a given number using recursive 
public class Factorial {

	//static method 
	public static void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of a given number:"+fact);
	}
	
	//instance method
	public void factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of a given number:"+fact);
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();//object creation
		Factorial.fact(5);//calling static method
		f.factorial(5);//calling instance method
	}

}
