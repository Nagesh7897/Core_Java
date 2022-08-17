package ForLoop;

public class FabinocciSeries {

	public static void main(String[] args) {
		int a,b,c;
		a=0;
		b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<=10; i++)      //fabinocci Series
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
			}

}
