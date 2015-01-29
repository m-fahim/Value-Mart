/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;
import java.io.*;
import java.sql.ResultSet;

/**
 *
 * @author mfahim
 */
public class Employee implements Serializable{
public Employee(){
    /*employee_id = 0;
    employee_username = new String();
    employee_l_name = new String();
    employee_email = new String();
    employee_ph_no = new String();
    employee_qualification = new String();
    department_id = 0;*/
    dB = new Database();
}
public int get_employee_id() { return employee_id;}
public void set_employee_id(int id) { employee_id=id;}
public String get_employee_username() { return employee_username;}
public void set_employee_username(String uname) { employee_username=uname;}
public String get_employee_pass() { return employee_username;}
public void set_employee_pass(char upas[]) {
    String upass = new String(upas);
    employee_pass=upass;
}
public String get_employee_f_name() { return employee_f_name;}
public void set_employee_f_name(String fname) { employee_f_name=fname;}
public String get_employee_l_name() { return employee_l_name;}
public void set_employee_l_name(String lname) { employee_l_name=lname;}
public String get_employee_email() { return employee_email;}
public void set_employee_email(String email) { employee_email=email;}
public String get_employee_ph_no() { return employee_ph_no;}
public void set_employee_ph_no(String ph) { employee_ph_no=ph;}
public String get_employee_mob_no() { return employee_mob_no;}
public void set_employee_mob_no(String mob) { employee_mob_no=mob;}
public String get_employee_birth_date() { return employee_birth_date;}
public void set_employee_birth_date(String birth) { employee_birth_date=birth;}
public String get_employee_qualification() { return employee_qualification;}
public void set_employee_qualification(String qua) { employee_qualification=qua;}
public String get_employee_join_date() { return employee_join_date;}
public void set_employee_join_date(String join) { employee_join_date=join;}
public String get_status() { return status;}
public void set_status(String sta) { status=sta;}
public int get_department_id() { return department_id;}
public void set_department_id(int dep_id) { department_id=dep_id;}
public Boolean insert_employee(){
    upStatus = dB.updateQry("INSERT INTO employee(employee_username, employee_f_name, employee_l_name, employee_email, employee_ph_no, employee_qualification, department_id )  VALUES ('"+this.get_employee_username()+"', '"+this.get_employee_f_name()+"', '"+this.get_employee_l_name()+"', '"+this.get_employee_email()+"', '"+this.get_employee_ph_no()+"', '"+this.get_employee_qualification()+"', "+this.get_department_id()+")");
    return upStatus;
    
}
public void update_employee(){}
public void delete_employee(){}
public ResultSet verify_employee(String uname ,char upas[] ,String sta){
    String upass = new String(upas);
    rs = dB.exeQry("SELECT * FROM employee WHERE employee_username = '"+ uname +"' and employee_pass = '"+ upass +"' and status = '"+ sta +"' ");
    return rs;
}
public ResultSet find_employee(String name){
    rs = dB.exeQry("Select * from employee where employee_id = '"+name+"' ");
    return rs;
}
public static  ResultSet find_all_employees(){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("Select * from employee");
    return rss;
}

private int  employee_id;
private String  employee_username;
private String  employee_pass;
private String  employee_f_name;
private String  employee_l_name;
private String  employee_email;
private String employee_ph_no;
private String employee_mob_no;
private String employee_birth_date;
private String employee_qualification;
private String employee_join_date;
private String status;
private int department_id;
private Database dB;
private ResultSet rs;
private Boolean upStatus;
}
