package methods;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstnumber = 42;
		int secondnumber = 34;
		int result = maxof(firstnumber,secondnumber);
		
		maxof(100 ,2);
		maxof(500,600);
		System.out.println(result);
		
		sayhi();
		maxof(5);

	}
	
	static int maxof(int a ,int b) {
	if (a>b) {
		return a;
	} else {
		return b;
	}
	}
	
	static void maxof(float d) {
	}
	
	static void sayhi() {
		System.out.println("hi");
		System.out.println("good morning");
	
	}

}

