
public class Two_Dm_Array {

	public static void main(String[] args) {
		String x[][] = new String[3][4];
		///firs row
		x[0][0] ="A";
		x[0][1] ="B";
		x[0][2] ="C";
		x[0][3] ="D";
		
		//second row
		x[1][0] ="A1";
		x[1][1] ="B1";
		x[1][2] ="C1";
		x[1][3] ="D1";
		
		//third row
		x[2][0] ="A2";
		x[2][1] ="B2";
		x[2][2] ="C2";
		x[2][3] ="D2";
		
		//rows
		System.out.println("rows are"+ x.length);
		//cols
		System.out.println("columns are"+x[0].length);  //no. of columns in fst row
		System.out.println("columns are"+x[1].length);  //second row
		
		for (int rownum=0;rownum<x.length;rownum++)
		{
			for (int colnum=0;colnum<x[rownum].length;colnum++)
			{
				System.out.print(x[rownum][colnum] +"--");
			}
			System.out.println();
		}

		Object ar[] = new Object [5]; //to store differnet datatype
		ar[0]= 34.45;
		ar[1]= "Hello";
		ar[2] = 'c';
		ar[3]=1099;
		ar[4]="333";
		ar[5]= true;
	}

}
