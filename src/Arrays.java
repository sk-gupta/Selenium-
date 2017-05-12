
public class Arrays {

	public static void main(String[] args) {
		//String username = "x";
		//String password = "y";
		//String email = "asd@sdfs.sdf";
		//String zipcode = "1234241";		
		String str[]=new String[3]; 
		str[0] = "x";
		str[1]="y";
		str[2]="asd@sdfs.sdf";
				
		int i[]= new int[4];
		i[0]=100;
		i[1]= 200;
		i[2]= 300;
		i[3]=400;
		char c[]=new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		//length of array
		System.out.println(str.length);
		System.out.println(i.length);
		
		for (int x=0;x<str.length;x++)
		{
			System.out.println(str[x]);
	}
		for (int y=0;y<i.length;y++)
		{
			System.out.println(i[y]);
	}
		for (int z=0;z<c.length;z++)
		{
			System.out.println(c[z]);
	}
	}
}

