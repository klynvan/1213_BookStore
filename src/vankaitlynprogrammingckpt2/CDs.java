/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;

/**
 *
 * @author kaitlynvan
 */
public class CDs extends Product{

    /**
     *
     */
    protected String cdName ;

    /**
     *
     */
    protected String artistName ;
    // displays the info of the cd
    @Override
    public String toString(){
        return "\n CD Title: " + cdName + " Artist: " + artistName + " Item ID: " + productID + " Quanity: " + count +" Price: " + price ;
    }

    /**
     *
     * @param itemNumber
     * @param productAmmount
     * @param price
     * @param cdName
     * @param artistName
     */
    public CDs(int itemNumber, int productAmmount,double price, String cdName,String artistName ) {
        super(itemNumber, productAmmount, price);
        this.cdName  = cdName;
        this.artistName = artistName;
    }

    /**
     * gets the artist name
     * @return
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * gets the cd name 
     * @return
     */
    public String getCdName() {
    return cdName ;
    }

    /**
     * set the artist name
     * @param artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * sets the cd name 
     * @param cdName
     */
    public void setCdName(String cdName ) {
    this.cdName  = cdName ;
    }
    
}
