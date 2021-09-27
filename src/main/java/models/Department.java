package models;

import java.util.IdentityHashMap;

public class Department {
    // market department
    // hr dpt
    // sales
    // growth
    // venture capitalist
    // number of employess

    private String marketing;
    private int sales;
    private String growth;
    private int numberofstaff;
    private String innovation;
    private String venturecaptalist;

    public Department(){
        this.marketing=marketing;
        this.sales=sales;
        this.growth=growth;
        this.numberofstaff=numberofstaff;
        this.innovation=innovation;
        this.venturecaptalist=venturecaptalist;
    }

    public String getMarketing(){return marketing;}

    public int getSales() {
        return sales;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public void setNumberofstaff(int numberofstaff) {
        this.numberofstaff = numberofstaff;
    }

    public void setInnovation(String innovation) {
        this.innovation = innovation;
    }

    public String getVenturecaptalist() {
        return venturecaptalist;
    }


    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void setVenturecaptalist(String venturecaptalist) {
        this.venturecaptalist = venturecaptalist;
    }

    public int getNumberofstaff() {
        return numberofstaff;
    }

    public String getInnovation() {
        return innovation;
    }
}
