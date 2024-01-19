package Devices;

import Interfaces.Connectable;

public class Computer implements Connectable{
        
    private boolean isOn = false;

    public void turnOn(){
        isOn = true;   
    }
    public void turnOff(){
        isOn = false;
    }
    public boolean isOn(){
        return isOn;
    }


}