package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import db.*;

class EmailLoginTest {

	@BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
	
	@Test
	void test() {
		DBConnection dbConnection = new DBConnection();
		
		assertEquals( true, dbConnection.login( "jane.doe@hotmail.com", "5678" ) );
		assertEquals( false, dbConnection.login( "jane.doe@hotmail.com", "4321" ) );
	}
}
