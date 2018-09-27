/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Fan {
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed=SLOW;
        this.radius=5;
        this.on=false;
        this.color="blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        if(this.on)
            return "A ventillátor sebessége="+this.speed+"\n"+
                    "A ventillátor sugara="+this.radius+"\n"+
                    "A ventillátor színe:"+this.color+"\n";
        else
            return "Fan is off\n"+
                    "A ventillátor sugara="+this.radius+"\n"+
                    "A ventillátor színe:"+this.color+"\n";
    }
    
    
    
}
