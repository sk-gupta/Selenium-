package testnG;

import org.testng.annotations.*;

public class TestDataProvider {

		@Test(dataProvider = "sf")	
		public void register(String uname, String password, String email, String City) {
			//scd
		System.out.println(uname+"---"+password+"----"+email+"-------"+City);
		}
		
		@DataProvider (name = "sf")
		//for each data a test count gets increased, i.e. if we ave 2 rows then the tests would be 2
		public Object[][] registerData() {
			//rows is equals to the no. of times the test has to be executed
			//columns = no. of parameters
			
			return new Object [][]
				{ {"user1","pass1","email1","city1"}, {"user2","pass2","email2","city2"}
			};
			
			/*Object [][] data = new Object[3][4];
			//first row
			data[0][0] = "user1";
			data[0][1] = "pass1";
			data[0][2] = "email1";
			data[0][3] = "city1";
			
			//second row
			data[1][0] = "user2";
			data[1][1] = "pass2";		
			data[1][2] = "email2"; 
			data[1][3] = "city2";
			
			//third row
			data[2][0] = "user3";
			data[2][1] = "pass3"; 		
			data[2][2] = "email3";
			data[2][3] = "city3";
			
			return data;
			*/
	
		}
		
}
		

	


