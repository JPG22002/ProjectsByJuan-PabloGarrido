/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clothes;

/**
 *
 * @author EDWIN
 */
public class Merchandise {
    private String size, nameOfMerch;
    private double price;
    private int quantity;

    public Merchandise(String size, String nameOfMerch, double price, int quantity) {
        this.size = size;
        this.nameOfMerch = nameOfMerch;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNameOfMerch() {
        return nameOfMerch;
    }

    public void setNameOfMerch(String nameOfMerch) {
        this.nameOfMerch = nameOfMerch;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Merchandise{" + "size=" + size + 
                ", nameOfMerch=" + nameOfMerch +
                ", price=" + price + ", quantity="
                + quantity + '}';
    }
    
    
    
}
