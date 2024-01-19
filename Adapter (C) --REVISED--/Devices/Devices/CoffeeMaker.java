package Devices;
public class CoffeeMaker{

    boolean isOff = true;

    public void On(){
        isOff = false;   
    }
    public void Off(){
        isOff = true;
    }
    public boolean isOff(){
        return isOff;
    }

}
