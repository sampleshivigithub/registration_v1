package com.registration_v1.model;

import java.sql.*;

public interface DAOService {
      public void connectDB();
      public boolean verifyCredentials(String email,String password);
      public void saveReg(String name, String email, String city, String mobile);
      public void deleteReg(String email);
      public void updateReg(String email, String mobile);
      public ResultSet getAllReg();
      public void closeDB();
	
}
