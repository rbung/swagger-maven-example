package com.foo.bar.model;

import com.wordnik.swagger.annotations.ApiProperty;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: chekong
 * 05/14/2013
 */
public class Car {
    @ApiProperty(required = true, notes = "car's id")
    private int id;

    @ApiProperty(required = true, notes = "The brand of the car")
    private String brand;

    @ApiProperty(required = true, notes = "The engine parameter of the car")
    private String engine;

    @ApiProperty(required = true, notes = "Indicate the car is MT or AT")
    private boolean mt;

    @ApiProperty(required = true, notes = "The price of the car")
    private float price;

    @ApiProperty(required = false, notes = "Any other comments for the car")
    private String notes;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isMt() {
        return mt;
    }

    public void setMt(boolean mt) {
        this.mt = mt;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
