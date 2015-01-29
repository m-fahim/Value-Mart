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
public class Order {
 public Order(){
    /*or_id = 0;
    or_name = new String();
    category_manufacture = new String();
    variety = new String();
    size = new String();
    category_description = new String();
    or_id = 0;*/
    dB = new Database();
}
public int get_or_id() { return or_id;}
public void set_or_id(int id) { or_id=id;}
public String get_or_name() { return or_name;}
public void set_or_name(String name) { or_name=name;}
public int get_product_id() { return product_id;}
public void set_product_id(int proID) { product_id=proID;}
public int get_employee_id() { return employee_id;}
public void set_employee_id(int emp) { employee_id=emp;}
public void set_or_quantity(int orQuan) { or_quantity=orQuan;}
public int get_or_quantity() { return or_quantity;}
public void set_or_total(int orTotal) { or_total=orTotal;}
public int get_or_total() { return or_total;}
public int insert_order(){
    upStatus = dB.updateQry("INSERT INTO order_pro(or_name, product_id, employee_id,or_quantity ,or_total)  VALUES ('"+this.get_or_name()+"', "+this.get_product_id()+", "+this.get_employee_id()+", "+this.get_or_quantity()+", "+this.get_or_total()+")");
    return upStatus;
}
public void update_category(){}
public void delete_category(){}
public ResultSet find_category(String name){
    rs = dB.exeQry("Select * from order_pro where or_name = '"+name+"' ");
    return rs;
}
public static  ResultSet find_all_order(){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("Select * from order_pro");
    return rss;
}
public static  ResultSet quick_find_category(String id){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("Select * from order_pro where or_id = "+id+"");
    return rss;
}

private int  or_id;
private String  or_name;
private int  product_id;
private int  employee_id;
private int or_quantity;
private int or_total;
private Database dB;
private ResultSet rs;
private int upStatus;
}
