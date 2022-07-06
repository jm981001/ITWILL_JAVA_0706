package operater;

public class Ex3 { //산술 연산자//형변환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	char ch ='A';
	System.out.println(ch+2); //67 나옴 2가 int 니까 숫자가 나옴
		
	         //int  int 
//	char ch2 = ch + 2;
//	System.out.println(ch+2); 
	
	char ch2 = (char)(ch + 2);
	System.out.println(ch2); 
	
	int i = 100;
	long l = 200;
	
//	int i2 = i+l; //오류 //int+ long = long //강제 형변환 해줘야됨
	int i2 = (int)(i+l);
	
	float f = 3.14f;
//	long l2 = l + f; // 결과 f 나와서 오류
	long l2 = (long)(l+f);
	
	System.out.println("========================================");
	
	System.out.println((double)10/3); //3.3333333333333335 //같다
	System.out.println(10/3.0); //3.3333333333333335       //같다
	
	byte b1= 10, b2 =20, b3;
	b3= 10+20;	//왜 오류가 안뜨지..? //10,20은 리터럴(상수)여서 리터럴 끼리 연산은 ㄱㅊ 
//	b3= 100+28; //오류 //범위 초과
	
	
	
	}

}
