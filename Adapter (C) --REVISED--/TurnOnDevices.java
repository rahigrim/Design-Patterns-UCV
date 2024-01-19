import Adapters.CoffeeMakerAdapter;
import Devices.CoffeeMaker;
import Devices.Computer;
import Devices.Lamp;
import Interfaces.Connectable;

public class TurnOnDevices {
    public static void main(String[] args) {
         turnOnDevice(new Lamp());
         turnOnDevice(new Computer());
         turnOnDevice(new CoffeeMakerAdapter(new CoffeeMaker()));
    }

    private static void turnOnDevice(Connectable device) {
        device.turnOn();
        System.out.println(device.isOn());
    }
}