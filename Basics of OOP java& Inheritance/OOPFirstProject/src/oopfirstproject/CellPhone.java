/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfirstproject;

/**
 *
 * @author M7md_2
 */
public class CellPhone {
private String manufact;
private String model;
private double retailPrice;
public void setManufact(String man){
    manufact=man;
}
public void setModel(String mod){
    model=mod;
}
public void setRetailPrice(double price){
    retailPrice=price;
}
public String getManufact(){
    return manufact;
}
public String getModel(){
    return model;
}
public double getRetailPrice(){
    return retailPrice;
}
}