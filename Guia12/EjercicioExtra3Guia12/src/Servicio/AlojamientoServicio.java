package Servicio;

import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author mauro
 */
public class AlojamientoServicio {
    
    AlojamientoExtrahotelero alojamiento;
    Hotel hotel;
    Random rand;
    
    public Camping crearCamping() {
        alojamiento = new AlojamientoExtrahotelero();
        alojamiento.crearAlojamientoExtrahotelero();
        rand = new Random();
        
        int capacidadMaxCarpas = rand.nextInt(50) + 10;
        int cantidadBanios = rand.nextInt(3) + 1;
        String tieneRestaurante = rand.nextBoolean() ? "Si" : "No";
        
        return new Camping(capacidadMaxCarpas, cantidadBanios, tieneRestaurante, alojamiento.getEsPrivado(), alojamiento.getSuperficieMetrosCuadrados(), alojamiento.getNombre(), alojamiento.getDireccion(), alojamiento.getLocalidad(), alojamiento.getGerente()
        );
    }
    
    public Residencia crearResidencia() {
        alojamiento = new AlojamientoExtrahotelero();
        alojamiento.crearAlojamientoExtrahotelero();
        rand = new Random();
        
        int cantidadDeHabitaciones = rand.nextInt(20) + 5;
        String descuentosAGremios = rand.nextBoolean() ? "Si" : "No";
        String campoDeportivo = rand.nextBoolean() ? "Si" : "No";
        
        return new Residencia(cantidadDeHabitaciones, descuentosAGremios, campoDeportivo, alojamiento.getEsPrivado(), alojamiento.getSuperficieMetrosCuadrados(), alojamiento.getNombre(), alojamiento.getDireccion(), alojamiento.getLocalidad(), alojamiento.getGerente());
    }
    
    public Hotel4Estrellas crearHotel4Estrellas() {
        hotel = new Hotel();
        hotel.crearHotel();
        rand = new Random();
        
        String[] nombresRestaurantes = {"Dinastía", "La Alameda Central", "La Duqueza", "Distrito Nova Bleu", "Iluminatia", "Tazón Dorado", "El Señor Del Sabor", "Casa de Cielo", "Cravin' Cactus", "The Dessert Affair", "Placido Gourmet", "La Fiesta Espresso", "Restaurante Ember", "Restaurante Mini brocheta", "Restaurante Zoftig", "Restaurante Pink", "Restaurante El diablo", "Restaurante Paralelo 23", "Zabor", "Deli Rico"};
        
        String gimnasio = rand.nextBoolean() ? "A" : "B";
        String nombreRestaurante = nombresRestaurantes[rand.nextInt(20)];
        int capacidadDelRestaurante = rand.nextInt(200) + 50;
        
        Hotel4Estrellas hotel4 = new Hotel4Estrellas(gimnasio, nombreRestaurante, capacidadDelRestaurante, hotel.getNumeroHabitaciones(), hotel.getNumeroCamas(), hotel.getCantDePisos(), hotel.getPrecioDeHabitaciones(), hotel.getNombre(), hotel.getDireccion(), hotel.getLocalidad(), hotel.getGerente());
        
        hotel4.setPrecioDeHabitaciones(calcularPrecioHabitacion(hotel4));
        
        return hotel4;
    }
    
    public Hotel5Estrellas crearHotel5Estrellas() {
        Hotel4Estrellas hotel4 = new Hotel4Estrellas();
        hotel4 = crearHotel4Estrellas();
        rand = new Random();
        
        int cantSalones = rand.nextInt(4) + 1;
        int cantSuites = rand.nextInt(5) + 2;
        int cantLimosinas = rand.nextInt(10) + 2;
        
        Hotel5Estrellas hotel5 = new Hotel5Estrellas(cantSalones, cantSuites, cantLimosinas, hotel4.getGimnasio(), hotel4.getNombreDelRestaurante(), hotel4.getCapacidadDelRestaurante(), hotel.getNumeroHabitaciones(), hotel.getNumeroCamas(), hotel.getCantDePisos(), hotel.getPrecioDeHabitaciones(), hotel.getNombre(), hotel.getDireccion(), hotel.getLocalidad(), hotel.getGerente());
        
        hotel5.setPrecioDeHabitaciones(calcularPrecioHabitacion(hotel5));
        return hotel5;
    }
    
    private double calcularPrecioHabitacion(Hotel hotel) {
        Hotel4Estrellas hotelb = (Hotel4Estrellas) hotel;
        double valorRestaurante;
        double valorGimnasio;
        
        if (hotelb.getCapacidadDelRestaurante() < 30) {
            valorRestaurante = 10;
        } else if (hotelb.getCapacidadDelRestaurante() >= 30 && hotelb.getCapacidadDelRestaurante() <= 50) {
            valorRestaurante = 30;
        } else {
            valorRestaurante = 50;
        }
        
        if (hotelb.getGimnasio().equals("A")) {
            valorGimnasio = 50;
        } else {
            valorGimnasio = 30;
        }
        
        if (hotel instanceof Hotel4Estrellas) {
            Hotel4Estrellas hotel4 = (Hotel4Estrellas) hotel;
            return 50d + hotel4.getNumeroHabitaciones() + valorRestaurante + valorGimnasio;
        } else if (hotel instanceof Hotel5Estrellas) {
            Hotel5Estrellas hotel5 = (Hotel5Estrellas) hotel;
            return 50d + hotel5.getNumeroHabitaciones() + valorRestaurante + valorGimnasio + hotel5.getCantidadDeLimosinas() * 15d;
        }
        return 0d;
    }
    
    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping c = (Camping) alojamiento;
                System.out.println(alojamiento);
            } else if (alojamiento instanceof Residencia) {
                Residencia r = (Residencia) alojamiento;
                System.out.println(alojamiento);
            } else if (alojamiento instanceof Hotel4Estrellas) {
                Hotel4Estrellas h4 = (Hotel4Estrellas) alojamiento;
                System.out.println(alojamiento);
                
            } else if (alojamiento instanceof Hotel5Estrellas) {
                Hotel5Estrellas h5 = (Hotel5Estrellas) alojamiento;
                System.out.println(alojamiento);
            }
            System.out.println("\n\n");
        }
    }
    
    public ArrayList<Hotel> filtrarHoteles(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Hotel> hoteles = new ArrayList();
        
        for (Alojamiento hotel : alojamientos) {
            if (hotel instanceof Hotel) {
                Hotel hot = (Hotel) hotel;
                hoteles.add(hot);
            }
        }
        
        Collections.sort(hoteles, Hotel.ordenarPorPrecioHabitacion);
        
        return hoteles;
    }
    
    public ArrayList<Camping> filtrarCampingsConRestaurante(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Camping> campings = new ArrayList();
        
        for (Alojamiento camping : alojamientos) {
            if (camping instanceof Camping) {
                Camping camp = (Camping) camping;
                if (camp.getTieneRestaurante().equals("Si")) {
                    campings.add(camp);
                }
            }
        }
        
        return campings;
    }
    
    public ArrayList<Residencia> filtrarResidenciaConDescuento(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Residencia> residencias = new ArrayList();
        
        for (Alojamiento residencia : alojamientos) {
            if (residencia instanceof Residencia) {
                Residencia res = (Residencia) residencia;
                if (res.getDescuentosAGremios().equals("Si")) {
                    residencias.add(res);
                }
            }
        }
        
        return residencias;
    }
}
