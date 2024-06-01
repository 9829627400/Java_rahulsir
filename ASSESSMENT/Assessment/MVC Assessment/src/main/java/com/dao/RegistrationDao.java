package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.UserModel;
import com.util.DBUtil;

public class RegistrationDao 
{
	Connection con=null;
	public int userRegistration(UserModel rModel)
	{
		int x=0;
		con=new DBUtil().getConnectionData();
		String query="insert into info(firstname, lastname, email, mobileno, address, gender, password) values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, rModel.getFirstname());
			st.setString(2, rModel.getLastname());
			st.setString(3, rModel.getEmail());
			st.setString(4, rModel.getMobileno());
			st.setString(5, rModel.getAddress());
			st.setString(6, rModel.getGender());
			st.setString(7, rModel.getPassword());
			
			x=st.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
		
	}
	
	public UserModel getLogin(UserModel lmodel)
	{
		UserModel model=null;
		con=new DBUtil().getConnectionData();
		String qry="select * from info where email=? and password=?";
		try {
			PreparedStatement st=con.prepareStatement(qry);
			st.setString(1, lmodel.getEmail());
			st.setString(2, lmodel.getPassword());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new UserModel();
				model.setUserid(rs.getInt(1));
				model.setFirstname(rs.getString("firstname"));
				model.setLastname(rs.getString(3));
				model.setEmail(rs.getString(4));
				model.setAddress(rs.getString(5));
				model.setMobileno(rs.getString(6));
				model.setGender(rs.getString(7));
				model.setPassword(rs.getString("password"));
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
		
	}
}
