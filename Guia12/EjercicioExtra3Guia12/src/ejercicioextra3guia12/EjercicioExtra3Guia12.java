package ejercicioextra3guia12;

import Entidades.*;
import Servicio.AlojamientoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra3Guia12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int respuesta;
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        ArrayList<Alojamiento> alojamientosfiltrados = new ArrayList();
        AlojamientoServicio as = new AlojamientoServicio();

        for (int i = 0; i < 100; i++) {
            alojamientos.add(as.crearCamping());
            alojamientos.add(as.crearResidencia());
            alojamientos.add(as.crearHotel4Estrellas());
            alojamientos.add(as.crearHotel5Estrellas());
        }

        System.out.println("Nuestra base de datos cuenta con " + alojamientos.size() + " alojamientos");
        System.out.println((alojamientos.size() / 4) + " Campings");
        System.out.println((alojamientos.size() / 4) + " Recidencias");
        System.out.println((alojamientos.size() / 4) + " Hoteles de 4 estrellas");
        System.out.println((alojamientos.size() / 4) + " Hoteles de 5 estrellas\n");

        do {
            alojamientosfiltrados.removeAll(alojamientosfiltrados);
            System.out.println("Podemos mostrar nuestros alojamientos segun la opcion que usted elija");
            System.out.println("1.- Todos los alojamientos");
            System.out.println("2.- Todos los hoteles de más caro a más barato");
            System.out.println("3.- Todos los campings con restaurante");
            System.out.println("4.- Todos las residencias que tienen descuento");
            System.out.println("5.- Salir");

            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1 -> {
                    as.mostrarAlojamientos(alojamientos);
                }
                case 2 -> {
                    alojamientosfiltrados.addAll(as.filtrarHoteles(alojamientos));
                    as.mostrarAlojamientos(alojamientosfiltrados);
                }
                case 3 -> {
                    alojamientosfiltrados.addAll(as.filtrarCampingsConRestaurante(alojamientos));
                    if (alojamientosfiltrados.isEmpty()) {
                        System.out.println("No se encontraron resultados\n");
                    } else {
                        System.out.println("Se encontraron " + alojamientosfiltrados.size() + " campings con restaurante");
                        as.mostrarAlojamientos(alojamientosfiltrados);
                    }
                }
                case 4 -> {
                    alojamientosfiltrados.addAll(as.filtrarResidenciaConDescuento(alojamientos));
                    if (alojamientosfiltrados.isEmpty()) {
                        System.out.println("No se encontraron resultados\n");
                    } else {
                        System.out.println("Se encontraron " + alojamientosfiltrados.size() + " residencias con descuentos a gremios");
                        as.mostrarAlojamientos(alojamientosfiltrados);
                    }
                }
                case 5 -> {
                    System.out.println("Muchas Gracias");
                }
                default -> {
                    System.out.println("Ingrese una opcion correcta");
                }

            }
        } while (respuesta != 5);

    }
}
