/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;

import java.util.ArrayList;

/**
 *
 * @author kaitlynvan
 */

abstract class Product {
    protected int count;
    protected int productID;
    protected double price;
    
    
    
    @Override
    public String toString(){
        return "\nItem ID: " + productID + " Quanity: " + count +" Price: " + price ;
    }


    public Product(int itemNumber, int productAmmount, double price) {
        this.productID= itemNumber;
        this.count = productAmmount;
        this.price = price;
        
     }
    public int getProductID() {
        return productID;
    }   
    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }
    

    public void setProductID(int productID) {

        this.productID = productID;
    }

    public int getCount() {
         return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void display(){
        System.out.println("Title: " + productID + " Quanity" + count + "Price" +price);
        
    }

    String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

