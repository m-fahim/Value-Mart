/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;
import java.io.*;
import java.sql.ResultSet;

/**
 *
 * @author mfahim
 */
public class Product implements Serializable{
public Product(){
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
public int get_quantity() { return quantity;}
public void set_quantity(int quan) { quantity=quan;}
public int get_price() { return price;}
public void set_price(int pri) { price=pri;}
public int insert_product(){
    upStatus = dB.updateQry("INSERT INTO product(product_name, product_brand, product_manufacture, variety, size, product_description, category_id )  VALUES ('"+this.get_product_name()+"', '"+this.get_product_brand()+"', '"+this.get_product_manufacture()+"', '"+this.get_variety()+"', '"+this.get_size()+"', '"+this.get_product_description()+"', "+this.get_category_id()+"', "+this.get_quantity()+" )");
    return upStatus;
}
public Boolean insert_product_client() throws Exception{
    qry = "INSERT INTO product(product_name, product_brand, product_manufacture, variety, size, product_description, category_id, quantity, price)  VALUES ('"+this.get_product_name()+"', '"+this.get_product_brand()+"', '"+this.get_product_manufacture()+"', '"+this.get_variety()+"', '"+this.get_size()+"', '"+this.get_product_description()+"', "+this.get_category_id()+", "+this.get_quantity()+", "+this.get_price()+")";
    return c.updateQry(qry);
}
public Boolean update_product(String proName){
    qry = "UPDATE product SET product_name = '"+this.get_product_name()+"', product_brand = '"+this.get_product_brand()+"', product_manufacture = '"+this.get_product_manufacture()+"', variety = '"+this.get_variety()+"', size = '"+this.get_size()+"', product_description = '"+this.get_product_description()+"', category_id = "+this.get_category_id()+"  WHERE product_name = '"+proName+"'";
    return c.updateQry(qry);
}
public Boolean delete_product(String proName){
    qry = " DELETE FROM product WHERE product_name = '"+proName+"' ";
    return c.updateQry(qry); 
}
public ResultSet find_product(String proName){
    rs = dB.exeQry("SELECT * FROM product where product_id = '"+proName+"' ");
    return rs;
}
public static  ResultSet find_all_products(){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("SELECT * FROM product");
    return rss;
}
public static  ResultSet find_product_name(String proName){
    Database dBB = new Database();
    ResultSet rss = dBB.exeQry("SELECT * FROM product where product_name = '"+proName+"'");
    return rss;
}
public static int update_product_quantity(String proName,int quan){
    Database dBB = new Database();
    int upStatus = dBB.updateQry("UPDATE product SET quantity = "+quan+"  WHERE product_name = '"+proName+"'");
    return upStatus;
}
private ClientTCPIP c = new ClientTCPIP(9999);
private int  product_id;
private String  product_name;
private String  product_brand;
private String  product_manufacture;
private String  variety;
private String size;
private String product_description;
private int category_id;
private int quantity;
private int price;
private Database dB;
private ResultSet rs;
private int upStatus;
private String qry;
}
