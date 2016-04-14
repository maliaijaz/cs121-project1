package project2;

import java.sql.*;                              // Enable SQL processing
import static java.lang.System.out; 


import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.util.*;


public class Login extends HttpServlet {
	
	public static boolean emailAuthenticator(Statement select, String email) throws SQLException {
		
		boolean exists = true;
		
		ResultSet result;
		
		String query = "Select email from customers where email = '" + email + "';";
		
		result = select.executeQuery(query);
		
		System.out.println("Result of the query is: " + result);
		
		if (result == null) {
			exists = false;
		}

		return exists;
	}
	
	public static boolean passwordAuthenticator(Statement select, String password) throws SQLException {
		
		boolean exists = true;
		
		ResultSet result;
		
		String query = "Select email from customers where passwrd = '" + password + "';";
		
		result = select.executeQuery(query);
		
		System.out.println("Result of the query is: " + result);
		
		if (result == null) {
			exists = false;
		}
		
		return exists;
	}
	
	// get the username from the user
	public static String getUsername(Scanner scan){
		String username = "";
		
		// Prompt user for username / authenticate later
		
		System.out.println("Enter your username (email): ");
		username = scan.nextLine();
		
		return username;
	}
	
	
	// gets the password from the user
	public static String getPassword(Scanner scan) {
		String password = "";
		// Prompt user for password / authenticate using helper method
		System.out.println("Enter your password: ");
		password = scan.nextLine();
		return password;
		
		// user inputs the password.
		// encrypt the password using MD5.
		// Then we store the encrypted password in the database.
		// Only when you unencrypt it is when you get the real password
		// when calling it first, encrypt the password first and compare it with the encrypted value in the table.
	}
	
	// HTTP stuff goes here
	
		public static void doHTTPPost(Servlet request, Servlet response, String username, String password){
			
		}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// Reading in input from the user
		
		
		// create mySQL instance
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		String database = "root";
		String dbPassword = "poop";
		
		// establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql:///moviedb", database, dbPassword); 
    	Statement select = connection.createStatement();
    	
    	// do HTPP post here

    	// authenticate here
	
		// Welcome message
		System.out.println("-----Welcome to FABFLIX-----\nPlease enter your login information below \n");
		
		Scanner scan = new Scanner(System.in);
		
		String username = getUsername(scan);
		String password = getPassword(scan);
		
		// Check if email and password exist in the DB
		boolean emailExists = emailAuthenticator(select, username);
    	boolean passwordExists = emailAuthenticator(select, password);
    	
    	
    	// put inside a while loop

    	if (emailExists) {
    		System.out.println("Email is officially authenticated.");
    	}
    	else if (!emailExists) {
    		// do a while loop
    		System.out.println("Email is not authenticated. Restart program");

    	}
    	if (passwordExists) {
    		System.out.println("Password is officially authenticated.");
    	}
    	else if (!passwordExists) {
    		System.out.println("Password is not authenticated. Restart program.");
    	}
		
    	System.out.println("\nSUCCESS!\nYour username is: " + username + "\nYour password is: " + password);
    	
		// close the scanner object (it is reused throughout the program)
		scan.close();
	}
}
