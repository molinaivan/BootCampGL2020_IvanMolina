package com.globallogic.myapp;


public class App 
{
    public static void main( String[] args )
    {
       ElectricalOven electricalIsOven = new ElectricalOven();
       
       System.out.println("energia inicial =" + electricalIsOven.getPower());
       
       electricalIsOven.turnOn();
       
       System.out.println("energia actual, luego de turnOn= " + electricalIsOven.getPower());
       
       electricalIsOven.turnLed();
       
       System.out.println("energia actual luego de turnLed= " + electricalIsOven.getPower());
      
    }
}
