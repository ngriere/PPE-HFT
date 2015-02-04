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
public class Ask {

    private String volumeA;
    private String priceA;

    public Ask(String volumeA, String priceA) {

        this.priceA = priceA;

        this.volumeA = volumeA;

    }

    public String getpriceA() {
        return priceA;
    }

    public void setpriceA(String priceA) {
        this.priceA = priceA;
    }

    public String getvolumeA() {
        return volumeA;
    }

    public void setvolumeA(String volumeA) {
        this.volumeA = volumeA;
    }

}
