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
public class VmUser implements Serializable{
public VmUser(){
    /*product_id = 0;
    product_name = new String();
    product_manufacture = new String();
    variety = new String();
    size = new String();
    product_description = new String();
    category_id = 0;*/
    dB = new Database();
}
public int get_product_id() { return product_id;}
public void set_product_id(int id) { product_id=id;}
public String get_product_name() { return product_name;}
public void set_product_name(String name) { product_name=name;}
public String get_product_brand() { return product_brand;}
public void set_product_brand(String brand) { product_brand=brand;}
public String get_product_manufacture() { return product_manufacture;}
public void set_product_manufacture(String manu) { product_manufacture=manu;}
public String get_variety() { return variety;}
public void set_variety(String va) { variety=va;}
public String get_size() { return size;}
public void set_size(String si) { size=si;}
public String get_product_description() { return product_description;}
public void set_product_description(String pro) { product_description=pro;}
public int get_category_id() { return category_id;}
public void set_category_id(int category) { category_id=category;}
public Boolean insert_product(){
    upStatus = dB.updateQry("INSERT INTO product(product_name, product_brand, product_manufacture, variety, size, product_description, category_id )  VALUES ('"+this.get_product_name()+"', '"+this.get_product_brand()+"', '"+this.get_product_manufacture()+"', '"+this.get_variety()+"', '"+this.get_size()+"', '"+this.get_product_description()+"', "+this.get_category_id()+")");
    return upStatus;
}
public void update_product(){}
public void delete_product(){}
public ResultSet find_product(String name){
    rs = dB.exeQry("Select * from product where product_id = '"+name+"' ");
    return rs;
}
public static  ResultSet find_all_products(){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("Select * from product");
    return rss;
}

private int  product_id;
private String  product_name;
private String  product_brand;
private String  product_manufacture;
private String  variety;
private String size;
private String product_description;
private int category_id;
private Database dB;
private ResultSet rs;
private Boolean upStatus;
}
