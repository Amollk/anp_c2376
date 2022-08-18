package example.org;

public class Addition {
	
	int num1=10; //initialization and declaration 
	int num2=20;
	int result =0;
	void sum() {
		result = num1+num2 ;
		System.out.println( "result") ;
		System.out.println("the result;"+result);
	}
	static void print()
	{
		System.out.println("static print method");
	}
	
	public static void main(String[] args) {
		
		print();
		System.out.println("main method");
      Addition additionObj=new Addition();
      additionObj.sum();
	}

}
