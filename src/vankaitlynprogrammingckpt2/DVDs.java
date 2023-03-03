/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;

/**
 * this class defines the DVD object
 * @author kaitlynvan
 */
public class DVDs  extends Product{

    /**
     * 
     */
    protected String dvdName ;
    //prints out difplay
    @Override
    public String toString(){
        return "\n DVD Title: " + dvdName + " Item ID: " + productID + " Quanity: " + count +" Price:" + price ;
    }

    /**
     * 
     * @param itemNumber
     * @param productAmmount
     * @param price
     * @param dvdName
     */
    public DVDs(int itemNumber, int productAmmount, double price, String dvdName) {
        super(itemNumber, productAmmount, price);
        this.dvdName  = dvdName ;
    }

    /**
     * gets the name of the dvd
     * @return
     */
    public String getDVDName() {
    return dvdName ;
    }

    /**
     * sets the name if the dvd
     * @param dvdName
     */
    public void setDVDName(String dvdName) {
    this.dvdName  = dvdName ;
    }
}
