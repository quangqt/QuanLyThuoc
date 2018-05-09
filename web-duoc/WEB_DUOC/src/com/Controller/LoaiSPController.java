package com.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Connection.ConnectionUtil;
import com.Model.LoaiSp;

public class LoaiSPController {
	  
    public List<LoaiSp> getListAllLoaiSP(Connection conn) throws SQLException, ClassNotFoundException {
		Statement statement = conn.createStatement();
    	String sql = "select * from loaisp";
        ResultSet rs = statement.executeQuery(sql);
        List<LoaiSp> lstLoaiSP = new ArrayList<LoaiSp>();
        while (rs.next()) {
            LoaiSp lsp = new LoaiSp();
            lsp.setMaLoai(rs.getString(1));
            lsp.setTenLoai(rs.getString(2));
            lstLoaiSP.add(lsp);
        }
        return lstLoaiSP;
    }
}
