package com.Connection;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
		return SQLServerConnUtils_SQLJDBC.getSQLServerConnection();
	}

	//
	// Test Connection ...
	//
	public static void closeQuietly(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}

	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
		}
	}
}
