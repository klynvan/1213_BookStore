/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * this class defines the CD object
 * @author kaitlynvan
 */
public class Books extends Product{

    /**
     *
     */
    protected String title ;
    
    
    @Override
    public String toString(){
        return "\n Book Title: " + title + " Item ID: " + productID + " Quanity: " + count +" Price: " + price ;
    }
    
    /**
     * allows book object to be created 
     * @param itemNumber
     * @param productAmmount
     * @param price
     * @param title
     */
    public Books(int itemNumber, int productAmmount, double price, String title) {
        super(itemNumber, productAmmount, price);
        this.title = title;
       
    }

    /**
     * get title
     * @return
     */
    public String getTitle() {
    return title;
    }

    /**
     * set the title
     * @param bookName
     */
    public void setTitle(String bookName) {
        this.title = title;
    } 
}
