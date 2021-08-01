package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=48;
		int c=30;
		int result = 0;
		
//	if(a>b) {
//		if (a>c) { result = a;
//	} else { result = c ; }
//	} else {
//		if (b>c) {result = b;} else { result = c;}
//	}
//	System.out.println("largest of three number is " + result);
//	}
//}
		
		result = a > b ? a > c ? a:c : b>c? b:c;
		
		System.out.println("largest of three number is " + result);
	}
}
