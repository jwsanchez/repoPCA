package Principal;

public class Main {
    public static void main(String[] args) {
        Usuario pepito = new Usuario();
        pepito.changePassword("pass","cambiada");
        System.out.println(pepito.getPassword());
    }

}
