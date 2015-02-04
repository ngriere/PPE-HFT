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
public class Lastexecuted {

    private String timestanp;
    private String price;
    private String num;

    public Lastexecuted(String timestanp, String price, String num) {

        this.timestanp = timestanp;
        this.price = price;
        this.num = num;

    }

    public String gettimestanp() {
        return timestanp;
    }

    public String getprice() {
        return price;
    }

    public void settimestanp(String timestanp) {
        this.timestanp = timestanp;
    }

    public void setprice(String price) {
        this.price = price;
    }

    public String getnum() {
        return num;
    }

    public void setnum(String num) {
        this.num = num;
    }

}
