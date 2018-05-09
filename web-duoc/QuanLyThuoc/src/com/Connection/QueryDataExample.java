package com.Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDataExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = ConnectionUtil.getMyConnection();

		Statement statement = connection.createStatement();

		String sql = "Select * from sanpham";

		ResultSet rs = statement.executeQuery(sql);

		while (rs.next()) {
			String empId = rs.getString(1);
			String empNo = rs.getString(2);
			String empName = rs.getString("masp");
			System.out.println("--------------------");
			System.out.println("EmpId:" + empId);
			System.out.println("EmpNo:" + empNo);
			System.out.println("EmpName:" + empName);
		}
		connection.close();

	}
}