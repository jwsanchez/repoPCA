package Principal;

public class Usuario {
    
    //Constructor
    
    public Usuario(){

    }

    //Atributos
    String id;
    String name;
    String correo;
    String password="pass";
    String photo;

    //Metodos
    public boolean pay(String id, int p) {
        this.id=id;
        return true;
    }
    
    public boolean changePassword (String oldPassword, String newPassword){
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            System.out.println("Contraseña cambiada");
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
