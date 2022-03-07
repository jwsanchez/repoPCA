package co.pca;

import co.pca.objetos.Productos;
import java.util.List;
import java.util.Scanner;

public class vista {
    public static void showPrincipalHeader() {
        System.out.println("\t\t**************************************");
        System.out.println("\t\t* BIENVENIDOS A LA CAJA REGISTRADORA *");
        System.out.println("\t\t**************************************");
    }

    public static void showGetOption() {
        System.out.print("\t\t* Digite una opción: ");
    }

    public void showMenuPrincipal() {
        System.out.println("\t\t\t 1. Comprar");
        System.out.println("\t\t\t 2. Vender");
        System.out.println("\t\t\t 3. Inventario");
        System.out.println("\t\t\t 4. Ventas");
        System.out.println("\t\t\t 5. Salir");
        showGetOption();
    }

    public static void showBuyMenu() {
        System.out.println("\t\t**************************************");
        System.out.println("\t\t*            STOCK        *");
        System.out.println("\t\t**************************************");
    }

    public static void showSaleMenu() {
        System.out.println("\t\t**************************************");
        System.out.println("\t\t*            VENTAS          *");
        System.out.println("\t\t**************************************");
    }

    public static void showStock(Productos[] productos) {
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*               I N V E N T A R I O                 *");
        System.out.println("\t\t*****************************************************");



        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t* PRODUCTO\t| Cantidad\t| Vr Unitario\t| Vr Total\t*");
        System.out.println("\t\t-----------------------------------------------------");
        for (Productos v : productos) {
            System.out.println("\t\t* "+v.getNombre()+"\t| "+v.getCantidad()+"\t\t| "+v.getPrecio()+"\t\t\t| "+v.getCantidad()*v.getPrecio()+"\t\t*");
        }
    }

    public static void showSales(List<Productos> productos) {
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                  V E N T A S                      *");
        System.out.println("\t\t*****************************************************");

        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t* PRODUCTO\t| Cantidad\t| Vr Unitario\t| Vr Total\t*");
        System.out.println("\t\t-----------------------------------------------------");
        for (Productos v : productos) {
            System.out.println("\t\t* "+v.getNombre()+"\t| "+v.getCantidad()+"\t\t| "+v.getPrecio()+"\t\t\t| "+v.getCantidad()*v.getPrecio()+"\t\t*");
        }
    }

    public static void showPurchases(List<Productos> productos) {
        System.out.println("\t\t*****************************************************");
        System.out.println("\t\t*                S T O C K                     *");
        System.out.println("\t\t*****************************************************");

        System.out.println("\t\t-----------------------------------------------------");
        System.out.println("\t\t* PRODUCTO\t| Cantidad\t| Vr Unitario\t| Vr Total\t*");
        System.out.println("\t\t-----------------------------------------------------");
        for (Productos v : productos) {
            System.out.println("\t\t* "+v.getNombre()+"\t| "+v.getCantidad()+"\t\t| "+v.getPrecio()+"\t\t\t| "+v.getCantidad()*v.getPrecio()+"\t\t*");
        }
    }


    public static void showProductOptions() {
        System.out.println("\t\t\t1. Papa");
        System.out.println("\t\t\t2. Arroz");
        System.out.println("\t\t\t3. Carne");
        System.out.println("\t\t\t4. Volver");
    }

    public static void clearConsole() {
        try {
            switch (System.getProperty("os.name").toLowerCase()) {
                case "linux":
                case "darwin":
                    System.out.print("\033[H\033[2J");
                    break;
                case "windows":
                    Runtime.getRuntime().exec("cls");
                    break;
                default:
                    System.out.println();
            }
        } catch (Exception ignored) {
            System.out.println(ignored);
        }
    }

    public int getCantidad(Scanner teclado) {
        System.out.print("\t\t\tDigite la cantidad: ");
        return teclado.nextInt();
    }

    public int getPrecio(Scanner teclado) {
        System.out.print("\t\t\tDigite el precio por unidad: ");
        return teclado.nextInt();
    }
}
