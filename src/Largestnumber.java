
public class Largestnumber {
	public static void main(String[] args) {
	
		int i[]= new int [4];
		i[0]=-3;
		i[1]= 5;
		i[2]= -4;
		i[3]=-7;
		int p = 0;
		int large=i[0];		
		for (p=0; p<=2; p++)
		{
					if (large<i[p+1]){
						large = i[p+1];}
		}
		System.out.println(large);
				}
}
		

