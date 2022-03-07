package minicio;

import java.io.*;
import javax.swing.JOptionPane;

public class Operacion {
    int cc,edad;
    String nombre,apellido,telefono,direccion,ruta="C:\\Users\\Wadyt\\Desktop\\clientes.txt",linea;
    
     public void crear(int Cantc ) throws IOException{
          
         Cliente c[]=new Cliente[Cantc];
         int i;
        for (i=0 ; i < Cantc; i++) {
         edad=  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
         nombre=  JOptionPane.showInputDialog("Ingrese en nombre");
         apellido=  JOptionPane.showInputDialog("Ingrese el apellido");
         telefono=  JOptionPane.showInputDialog("Ingrese el telefono");
         direccion=  JOptionPane.showInputDialog("Ingrese la direcciòn");
         c[i]= new Cliente(cc, edad, nombre, apellido, telefono, direccion);
         System.out.println(" El cliente #"+i+"es: "+c[i]);
        }
         FileWriter fr=null;
         try {
             
         fr= new FileWriter(ruta);
         PrintWriter pw = new PrintWriter(fr);
           for (i=0 ; i < Cantc; i++) {         
            pw.println(" "+"cliente " +i+";"+String.valueOf(c[i].edad)+";"+String.valueOf(c[i].nombre)+""
               + ";"+String.valueOf(c[i].apellido)+";"+String.valueOf(c[i].telefono)+";"+String.valueOf(c[i].direccion)+" ");
           }
           
         } catch (Exception e) {
            
             System.out.println("error de creación del archivo: "+e.getMessage());
        
         }
        finally {
             try {
              if (null != fr)
                 fr.close();
              } catch (Exception e2) {
                 e2.printStackTrace();
              }
          }
        
  }
    
   public  void leer() throws FileNotFoundException, IOException{
       
        try {
         FileReader fr= new FileReader(ruta);
         BufferedReader br= new BufferedReader(fr);
         linea=br.readLine();
         
         int i=1;
            while (linea !=null) {
                       
                System.out.println(linea);
                linea=br.readLine();
                i=i+1;
            }
            fr.close();  
            } catch (Exception e) {
       
           System.out.println("Error al leer el archivo: "+e.getMessage());
      }
 }
}
