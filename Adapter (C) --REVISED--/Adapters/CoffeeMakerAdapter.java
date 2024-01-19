package Adapters;
import Devices.CoffeeMaker;
import Interfaces.Connectable;

public class CoffeeMakerAdapter implements Connectable{

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerAdapter(CoffeeMaker coffeemaker){
        this.coffeeMaker = coffeemaker;
    }

    @Override
    public void turnOn() {

        coffeeMaker.On();

    }

    @Override
    public void turnOff() {

        coffeeMaker.Off();
      
    }

    @Override
    public boolean isOn() {

        return !coffeeMaker.isOff();
      
    }

}