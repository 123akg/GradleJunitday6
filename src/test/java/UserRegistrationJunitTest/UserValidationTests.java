package UserRegistrationJunitTest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTests {
 
	//Happy
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateFirstName("Abhijeet");
		Assert.assertEquals(true,result);		
	}
   
	//Sad	
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateFirstName("Abhijeet");
		Assert.assertEquals(false,result);		
	}
	
	//Happy
		@Test
		public void givenLastName_WhenValid_ShouldReturnTrue() {
			UserRegistration UR= new UserRegistration();
			boolean result=UR.validateLastName("Kumar Giri");
			Assert.assertEquals(true,result);		
		}
	
		//Sad	
		@Test
		public void givenLastName_WhenInvalid_ShouldReturnFalse() {
			UserRegistration UR= new UserRegistration();
			boolean result=UR.validateLastName("Kumar Giri");
			Assert.assertEquals(false,result);		
		}
	
		//Happy
		@Test
		public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateEmail("abhijeet@gmail.com");
		Assert.assertEquals(true,result);		
		}
	
		//Sad	
		@Test
		public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateEmail("abhijeet@gmail.com");
		Assert.assertEquals(false,result);		
		}
		
		//Happy
				@Test
				public void givenMobileNo_WhenValid_ShouldReturnTrue() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validateMobileNo("+91 9682648829");
				Assert.assertEquals(true,result);		
				}
			
				//Sad	
				@Test
				public void givenMobileNo_WhenInvalid_ShouldReturnFalse() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validateMobileNo("+91 9682648829");
				Assert.assertEquals(false,result);		
				}
				
				//Happy
				@Test
				public void givenPassword_WhenValid_ShouldReturnTrue() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validatePassword("Abhi@123");
				Assert.assertEquals(true,result);		
				}
			
				//Sad	
				@Test
				public void givenPassword_WhenInvalid_ShouldReturnFalse() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validatePassword("Abhi@123");
				Assert.assertEquals(false,result);		
				}
}
