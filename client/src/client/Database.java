/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.sql.*;

/**
 *
 * @author mfahim
 */
public class Database {
    public Database(){
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error :: Making Connection.");
        }
        try {
            con = DriverManager.getConnection("jdbc:odbc:vm");
        } catch (SQLException ex) {
            System.out.println("Error :: Connecting Database.");
        }
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error :: Making Statement");
        }
    }
    public ResultSet exeQry(String qry){
        try {
            rs = st.executeQuery(qry);
        } catch (SQLException ex) {
            System.out.println("Error :: In Executing Query.");
        }
         return rs;
    }
    public int updateQry(String qry){
        try {
            upStatus = st.executeUpdate(qry);
        } catch (SQLException ex) {
            System.out.println("Error :: In Updating Query.");
        }
         return upStatus;
    }
private Connection con;
private Statement st;
private ResultSet rs;
private int upStatus;
}
