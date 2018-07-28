package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import application.User;
import db.DBConnection;

class CreateUserTest {

	@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
	
	@Test
	void test() {
		User user = new User( "dan.mota", "Weltec2018", "test@test.com" );
		DBConnection dbConnection = new DBConnection();
		
		dbConnection.createUser( user );
		
		assertEquals( true, dbConnection.login( "dan.mota", "Weltec2018" ) );
		assertEquals( true, dbConnection.login( "test@test.com", "Weltec2018" ) );
	}

}
