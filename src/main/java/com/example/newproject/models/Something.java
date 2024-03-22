package com.example.newproject.models;

public class Something {
    private int id;
    private String text;
    private double number;

    public Something(int id, String text, double number){
        this.id = id;
        this.text = text;
        this.number=number;

    }
    public Something(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
