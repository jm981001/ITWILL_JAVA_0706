package typecasting;

public class Ex1 {//형변환

	public static void main(String[] args) {
		
		int a1 = 128;
		byte a2 = 127;
		System.out.println("변환 전 a1(int) : " + a1 + ", a2(byte) : " + a2);
		
		//묵시적 형변환  작-> 큰
//		a1 = a2;
		a1= (int)a2; //형변환 연산자 사용해도됨 근데 자연스럽게 돼서 쓸 필요가 없
		
		System.out.println("변환 후 a1(int) : " + a1 + ", a2(byte) : " + a2);

		System.out.println("===============================================");

		int b1 = 128;
		byte b2 = 127;
		
		System.out.println("변환 후 b1(int) : " + b1 + ", b2(byte) : " + b2);
		
//		b2 = b1; //오류뜸// byte보다 더 큰 int 타입을 byte타입으로 바꾸려고해서 자동적으로 변환 되지 않는다
		b2 = (byte)b1; 
		System.out.println("변환 후 b1(int) : " + b1 + ", b2(byte) : " + b2); //오버플로우 발생해서 b2= -128됨 

		
		System.out.println("===============================================");
		
		int c1 = 10;
		byte c2 = 0;
		System.out.println("변환 후 c1(int) : " + c1 + ", c2(byte) : " + c2);
		c2= (byte)c1;
		System.out.println("변환 후 c1(int) : " + c1 + ", c2(byte) : " + c2);

		
		
		
		
		
		
	}

}
