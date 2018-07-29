package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import application.User;
import db.DBConnection;

class CredentialsConflictTest {

	@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
	
	@Test
	void test() {
		User user = new User( "joe.doe", "1234", "joe.doe@hotmail.com" );
		User user1 = new User( "d.mota", "password", "jane.doe@hotmail.com" );
		User user2 = new User( "d.mota", "password", "d.mota@hotmail.com" );
		DBConnection dbConnection = new DBConnection();
		
		assertEquals( 1, dbConnection.checkCredentialsConflict( user ) );
		assertEquals( 2, dbConnection.checkCredentialsConflict( user1 ) );
		assertEquals( 0, dbConnection.checkCredentialsConflict( user2 ) );
	}

}
