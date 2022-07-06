package operater;

public class Ex7 { //삼항연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 10;
	String result = a%2 ==0 ? "짝수" : "홀수";
	System.out.println(result);	//짝수
	a = 11;
	result = a%2 ==0 ? "짝수" : "홀수";
	System.out.println(result);	//홀수
	
	System.out.println("=================================");
	
	a = 30;
	int b = 20;
	
	int max= a>b ? a : b;
	int min= a<b ? a : b;
	System.out.println(max);	//30
	System.out.println(min);	//20
	
	String strMax= a>b ? "a" : "b";
	String strMin= a<b ? "a" : "b";
	System.out.println(strMax);	//a
	System.out.println(strMin);	//b
	
	System.out.println("=================================");
	
	//반올림 수행
	double d = 97.3148;
	
	//삼항연산자 활용
	int i = ((d*10)%10) >= 5? (int)d+1 : (int)d;
	System.out.println(i);
	
	//Math.round() 함수 활용
	System.out.println(Math.round(d));
	
	
	//소수점 첫째자리까지 표시 (반올림)
	System.out.println((double)Math.round(d*10)/10); //3.142(형변환 해서 소숫점도 남도록)
	
	
	}
}
