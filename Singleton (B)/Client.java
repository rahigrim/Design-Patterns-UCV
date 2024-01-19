public class Client {

    public static void main(String[] args) {
        Config config = Config.getInstance();
        config.setName("DB_IS-2023");
        
        System.out.println("El nombre de la Base de Datos es: " + config.getName());
    }
    
}
