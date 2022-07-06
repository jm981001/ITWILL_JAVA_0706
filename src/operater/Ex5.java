package operater;

public class Ex5 { //비교 연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b= 5;
		
		System.out.println("a > b 인가? " + (a > b)); //괄호 필수//true
		System.out.println("a < b 인가? " + (a < b));		 //false
		System.out.println("a >= b 인가? " + (a >= b)); 		 //true
		System.out.println("a >= b 인가? " + (a >= b));		 //true
		System.out.println("a != b 인가? " + (a != b));		 //true
		System.out.println("a >= b 인가? " + (a == b)); 		 //false
		
		boolean bool = (a==b);
		
		//char 타입을 비교 연산자에 사용시 정수(유니코드)값을 비교
		System.out.println('A'>'B');	//false
//		System.out.println("A">"B");	//문자열은 대소관계 비교할 수 없다
		System.out.println('A'==65);	//true
		
		System.out.println(3==3.0);		//true
		System.out.println(0.1==0.1f);	//false//근사치 표현에 의해 서로 다른값으로 취급
 
		System.out.println((float)0.1==0.1f);//true
		
		
		
	}
}
