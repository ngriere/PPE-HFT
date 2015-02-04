/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author bachir
 */
public class Bid {
 private String volumeB;
private String priceB;
public Bid( String volumeB, String priceB){
    
   
    
    this.priceB = priceB;
    this.volumeB = volumeB;
    
}


public String getpriceB() {
        return priceB;
    }



public void setpriceB(String priceB) {
        this.priceB = priceB;
    }



public String getvolumeB() {
        return volumeB;
    }



public void setvolumeB(String volumeB) {
        this.volumeB = volumeB;
    }

}
