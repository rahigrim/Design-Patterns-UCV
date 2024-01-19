public class TurnOnDevices {

    interface Connectable {
        void turnOn();
        void turnOff();
        boolean isOn();
    }

    static class Computer implements Connectable{
        
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

    static class Lamp implements Connectable{

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

    static class CoffeeMaker{

        boolean isOff = true;

        void On(){
            isOff = false;   
        }
        void Off(){
            isOff = true;
        }
        boolean isOff(){
            return isOff;
        }

    }

    static class DeviceAdapter implements Connectable{

        private CoffeeMaker coffeeMaker;

        DeviceAdapter(CoffeeMaker coffeemaker){
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
    public static void main(String[] args) {
         turnOnDevice(new Lamp());
         turnOnDevice(new Computer());
         turnOnDevice(new DeviceAdapter(new CoffeeMaker()));
    }

    private static void turnOnDevice(Connectable device) {
        device.turnOn();
        System.out.println(device.isOn());
    }
}