package com.lti.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.LocalDate;
import java.util.Scanner;

public class DBInfo {
	public static void main(String[] args) {
		Connection conn=null;
		try{
			//step 1 load the jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step2 establish connection with database
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String usr="hr";
			String pass="hr";
			conn=DriverManager.getConnection(url,usr,pass);
			
			
			
			DatabaseMetaData meta = conn.getMetaData();
		    System.out.println("productName " +meta.getDatabaseProductName() );
		    System.out.println("productVersion " + meta.getDatabaseProductVersion());
			System.out.println("yah connection done...");
			
			Statement stmt=conn.createStatement();
		    //stmt.execute("create table temp (empno number(10))");
		    //System.out.println("table created");
			ResultSet rs=stmt.executeQuery("select * from emp");
			while(rs.next()){
				
					System.out.print(rs.getInt(1)+"      \t");
					System.out.print(rs.getString(2)+"   \t");
					System.out.print(rs.getString(3)+"   \t");
					System.out.print(rs.getInt(4)+"      \t");
					System.out.print(rs.getDate(5)+"     \t\t\t");
					System.out.print(rs.getInt(6)+"      \t");
					System.out.print(rs.getInt(7)+"      \t");
					System.out.println(rs.getInt(8)+"    \t");
				
			}
			
			
			// wrong output System.out.println(rs.getString(1));
			
			
			ResultSet s1= stmt.executeQuery("select count(*) c from emp");
			if(s1.next()){
				System.out.println("Count  "+s1.getInt("c"));
			}
			//Function call
			CallableStatement cst=conn.prepareCall("{?=call f1(?,?)}");
			cst.registerOutParameter(1, Types.NUMERIC);
			cst.setInt(2, 10);
			cst.setInt(3, 20);
			cst.executeQuery();
			System.out.println("Addition "+cst.getInt(1));
		/*	
			//Procedure call 
			CallableStatement cst2=conn.prepareCall("{call get_emp_data2(?,?,?)}");
			cst2.setInt(1, 7369);//in parameter
			cst2.registerOutParameter(2, Types.VARCHAR);//out parameter
			cst2.registerOutParameter(3, Types.DOUBLE);
			cst2.execute();
			System.out.println(cst2.getString(2));
			System.out.println(cst2.getDouble(3));
			
		*/
			//executeUpdate DML & DDL
	
			//Statement stmt1=conn.createStatement();
			//int count=stmt1.executeUpdate("insert into dept values(60,'rohan','mumbai' )");
			//System.out.println(count+"  row inserted");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter deptno : ");
			int deptno=Integer.parseInt(sc.next());
			System.out.println("Enter Name : ");
			String name=sc.next().toUpperCase();
			System.out.println("Enter Location : ");
			String location=sc.next().toUpperCase();
			//int count2=stmt1.executeUpdate("insert into dept values("+deptno+",'"+name+"','"+location+"')");
			//System.out.println(count2+"  row inserted");
			
			String sql="insert into dept values (?,?,?)";
			PreparedStatement pt=conn.prepareStatement(sql);
			pt.setInt(1,deptno);
			pt.setString(2,name);
			pt.setString(3, location);
			int count3 = pt.executeUpdate();
			//System.out.println(sql);
			System.out.println(count3+"Row inserted");
			
		}
		catch(ClassNotFoundException e){
			System.out.println("Failed to load JDBC Driver ." +" Check if the driver jar is in the classpath");
		}
		catch(SQLException q1){
			q1.printStackTrace();
			
		}
		finally{
			try{ 
				conn.close();
			}
			catch(Exception e){}
		}
		
	}

}
