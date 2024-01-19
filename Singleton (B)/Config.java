public class Config {

    private static Config singleton;
    private String name;
    private String url;
    private String user;
    private String password;

    // Constructor privado, bloquea la creación de instancias fuera de la clase.
    private Config(){}


    public static Config getInstance(){
    // Verificación: solo debe existir una única instancia.
        if (singleton == null) {
            singleton = new Config();
        }
        return singleton;
    }
    
    public String getName(){

        return name;
    }

    public String getURL(){

        return url;
    }

    public void setName(String newName){
        this.name = newName; 
    }

     // --- No se incluyen el resto de los métodos. Este código es solo un intento de capturar la idea principal. ---

}
