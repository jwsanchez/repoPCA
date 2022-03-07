package co.pca;

import co.pca.almacenamiento.Almacen;
import co.pca.objetos.Productos;
import java.util.Scanner;

public class Principal {

    private static Scanner teclado = new Scanner(System.in);
    private static Almacen almacen = new Almacen();
    private static vista vista = new vista();

    public static void main(String[] args) {

        //Se crea el espacio
        //Almacen almacen = new Almacen();
        init();
    }


    

    public static void init() {
        int oPrincipal;
        do {
            vista.showPrincipalHeader();
            vista.showMenuPrincipal();
            oPrincipal = teclado.nextInt();
            vista.clearConsole();
            switch (oPrincipal) {
                case 1:
                    vista.showBuyMenu();
                    vista.showProductOptions();
                    buy();
                    break;
                case 2:
                    vista.showSaleMenu();
                    vista.showProductOptions();
                    sale();
                    break;
                case 3:
                    vista.showStock(almacen.getAll());
                    System.out.println("Digite una tecla para continuar...");
                    teclado.nextInt();
                    break;
                case 4:
                    vista.showSales(almacen.getVentas());
                    System.out.println("Digite una tecla para continuar...");
                    teclado.nextInt();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar nuestra app");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (oPrincipal != 6);
    }

    private static void buy() {
        int buyOption;
        do {
            vista.showGetOption();
            buyOption = teclado.nextInt();
            if (buyOption >= 1 && buyOption <= 3) {
                buyProduct(buyOption);
            } else if (buyOption == 4) {
                System.out.println("\t\tSaliendo del módulo de compras...");
            } else {
                System.out.println("\t\tOpción no válida");
            }
        } while (buyOption != 4);
    }

    private static void sale() {
        int saleOption;
        do {
            vista.showGetOption();
            saleOption = teclado.nextInt();
            if (saleOption >= 1 && saleOption <= 3) {
                saleProduct(saleOption);
            } else if (saleOption == 4) {
                System.out.println("\t\tSaliendo del módulo de ventas...");
            } else {
                System.out.println("\t\tOpción no válida");
            }
        } while (saleOption != 4);
    }

    private static void buyProduct(int buyOption) {
        Productos productos = null;
        switch (buyOption) {
            case 1:
                productos = new Productos("Papa");
                break;
            case 2:
                productos = new Productos("Arroz");
                break;
            case 3:
                productos = new Productos("Carne Blanda");
                break;
            default:
                System.out.println("Opción no válida");
        }
        int cantidad = vista.getCantidad(teclado);
        int precio = vista.getPrecio(teclado);
        productos.setCantidad(cantidad);
        productos.setPrecio(precio);
        almacen.comprar(productos);
    }

    private static void saleProduct(int venta) {
        Productos productos = null;
        if (venta < 1 || venta > 3) {
            System.out.println("el producto no existe");
            return;
        }

        productos = almacen.getIndice(venta - 1);
        if (productos == null) {
            System.out.println("el producto es invalido");
        }
        System.out.println(productos);
        int cantidad = vista.getCantidad(teclado);
        productos.setCantidad(cantidad);
        productos.setPrecio(productos.getPrecio());
        System.out.println("\t\t\tValor a recibir: " + productos.getCantidad() * productos.getPrecio());
        almacen.vender(productos);
        //almacen.vender(productos, cantidad);
    }
}

