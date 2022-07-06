package operater;

public class Ex2 {//산술연산자

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10+2);
		System.out.println(10-2);
		System.out.println(10*2);
		System.out.println(10/3);	//3
		System.out.println(10/3.0); //3.3333333333333335
		System.out.println(10%3);	//1
		System.out.println(10%3.0); //1.0
	
		System.out.println("========================================");
		
		//산술 연산시 자동 형변환
		byte b1 =10, b2 = 20, b3;
		System.out.println(b1+b2);
//		b3=b1+b2; //오류뜸 // byte + byte = int 가 되어버림...저장 불가능 
		b3= (byte)(b1+b2); //결과 전체를 byte로 바꿔야함
		
		
	}

}
