package operater;

public class Ex6 { //논리 연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean a = false;
	boolean b = true;
	
	//AND연산자 (&&) 둘 다 true일때만 true
	System.out.println("a(false) && a(false)= " + (a && a));	//false
	System.out.println("a(false) && a(true)=  " + (a && b));	//false
	System.out.println("a(true)  && a(false)= " + (b && a));	//false
	System.out.println("a(true)  && a(true)=  " + (b && b));	//true
	System.out.println();
	
	//OR연산자 (||) 하나라도 만족 할 경우 true
	System.out.println("a(false) || a(false)= " + (a || a));	//false
	System.out.println("a(false) || a(true)=  " + (a || b));	//true
	System.out.println("a(true)  || a(false)= " + (b || a));	//true
	System.out.println("a(true)  || a(true)=  " + (b || b));	//true
	System.out.println();
	
	//NOT연산자 (!)
	System.out.println("!a(flase)= " + (!a));	//true
	System.out.println("!b(true)=  " + (!b));	//false
	System.out.println();
	
	//XOR연산자 (^)
	System.out.println("a(false) ^ a(false)= " + (a ^ a));	//false
	System.out.println("a(false) ^ a(true)=  " + (a ^ b));	//true
	System.out.println("a(true)  ^ a(false)= " + (b ^ a));	//true
	System.out.println("a(true)  ^ a(true)=  " + (b ^ b));	//false
	System.out.println();
	
	// &&,||는 불필요한 연산은 하지 않는다
	int i = 10;
	boolean result = i > 5 || i++ > 5;
	System.out.println(i);
	
	}
}
