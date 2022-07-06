package operater;

public class Ex1 {//단항연산자

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1 = 5;
		int y1 = ++x1;
		System.out.println("x1: " + x1 + " , y1 : " +y1);
		
		int x2 = 5;
		int y2 = x2++;
		System.out.println("x2: " + x2 + " , y2 : " +y2);
		
		System.out.println("=============================================");
		
		int x = 10, y=5;
		int z = ++x + y--;
		System.out.println("x: " + x + " , y : " +y+ " , z: " +z);
		
		System.out.println("=============================================");

		
		int i =3;
		i++;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println("=============================================");

		//구구단을 단항 연산자를 이용해서 출력 
		int dan =2;
		int index=1;
		System.out.println("< "+ dan +" >" );
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		System.out.println(dan + "*" + index +"="+ dan*index++);
		
		
		
		
		
		
		
	}

}
