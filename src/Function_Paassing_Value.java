
public class Function_Paassing_Value {

	public static void main(String[] args) {
		sumall(1,2,3);
		sumall(2,3,5);
		sumall("Hello",34,6);
		int s = sumall(1,3,99);
		if (s>100)
		{
			System.out.println("sum is more than 100---"+s);
		}
			else
			{
				System.out.println("sum is less than 100----"+s);
			}
			
		
		//System.out.println(s);
	}  
	public static int sumall(int a, int b, int c ){
		int sum = a+b+c;
		System.out.println(sum);
		return sum;
	}
	public static void sumall(String x, int y, int z ){
		
		System.out.println(x+y+z);
	}
}
