package operater;

public class Ex4 { //대입 연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0;
		
		b+=a;
		System.out.println(b);//10
		System.out.println("=========================");
		
		b+=a;
		System.out.println(b);//20
		
		b-=a;
		System.out.println(b);//10
		
		b*=a;
		System.out.println(b);//100
	
		b/=a;
		System.out.println(b);//10
		
		b%=a;
		System.out.println(b);//0
		
		System.out.println("=========================");

		//복합 대입연산자는 연산 시 자동 형변환이 일어나지 않습니다
		short s = 10;
//		s = s + 10;	//int+int = int 강제 형 변환 해줘야됨
		s = (short)(s+10);
		s += 10; // 복합 대입연산자는 에러 안남 // 강제 형 변환 해줄 필요 없음
	}
}
