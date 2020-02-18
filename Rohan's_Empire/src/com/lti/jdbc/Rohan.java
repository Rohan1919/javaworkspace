package com.lti.jdbc;

import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class Rohan {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement ps=con.prepareStatement("insert into dept values(?,?,?)");
		ps.setInt(1, 11);
		ps.setString(2, "sandesh");
		ps.setString(3, "england");
		int c=ps.executeUpdate();
		System.out.println(c+"records inserted");
		int a;
		CallableStatement cs= con.prepareCall("{?=call f1(?,?)}");
		cs.registerOutParameter(1,Types.NUMERIC);
		cs.setInt(2, 10);
		cs.setInt(3, 30);
		cs.execute();
		System.out.println(cs.getInt(1));
		
		
		
	}

}
