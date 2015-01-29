/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import java.sql.*;

/**
 *
 * @author mfahim
 */
public class Category {
 public Category(){
    /*category_id = 0;
    category_name = new String();
    category_manufacture = new String();
    variety = new String();
    size = new String();
    category_description = new String();
    category_id = 0;*/
    dB = new Database();
}
public int get_category_id() { return category_id;}
public void set_category_id(int id) { category_id=id;}
public String get_category_name() { return category_name;}
public void set_category_name(String name) { category_name=name;}
public String get_family() { return family;}
public void set_family(String fam) { family=fam;}
public String get_subcategory() { return subcategory;}
public void set_category_manufacture(String subCate) { subcategory=subCate;}
public Boolean insert_category(){
    upStatus = dB.updateQry("INSERT INTO product_category(category_name, family, subcategory )  VALUES ('"+this.get_category_name()+"', '"+this.get_family()+"', '"+this.get_subcategory()+")");
    return upStatus;
}
public void update_category(){}
public void delete_category(){}
public ResultSet find_category(String name){
    rs = dB.exeQry("Select * from product_category where category_name = '"+name+"' ");
    return rs;
}
public static  ResultSet find_all_category(){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("Select * from product_category");
    return rss;
}
public static  ResultSet quick_find_category(String id){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("Select * from product_category where category_id = "+id+"");
    return rss;
}

private int  category_id;
private String  category_name;
private String  family;
private String  subcategory;
private Database dB;
private ResultSet rs;
private Boolean upStatus;
}
