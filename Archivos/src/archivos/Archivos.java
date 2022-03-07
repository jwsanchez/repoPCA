package archivos;

import java.io.BufferedReader;
import java.io.FileReader;


public class Archivos {

    public static void main(String[] args) {
        try{
            FileReader ruta = new FileReader("C:\\Users\\Wadyt\\Desktop\\archivo.txt");
            BufferedReader br = new BufferedReader(ruta);
            String texto;
            while ((texto=br.readLine())!=null){
                System.out.println(""+texto);
            }
        }catch(Exception ex){
            
        }
    }

}
