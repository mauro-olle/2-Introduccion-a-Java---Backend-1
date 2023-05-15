/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tamaño = 20;
        String sopaDeLetras[][] = new String [20][20];
        int longitud, fila, columna, posicion;
        int pos = 0;
        String palabra;
        boolean bandera, direccion;
        
        for (int i = 0; i < 3; i++) {
            do {
                System.out.println("Ingrese la " + (i+1) + "° palabra");
                palabra = sc.next().toUpperCase();

                longitud = palabra.length();
                if (longitud < 3 || longitud > 7) System.out.println("Debe tener entre 3 y 7 caracteres");
            } while (longitud < 3 || longitud > 7);
            
            do {
                bandera = true;
                
                do {
                    direccion = true;
                    
                    fila = (int) (Math.random() * tamaño);
                    columna = (int) (Math.random() * tamaño);
                    posicion = (int) (Math.random() * 8);
                    
                    System.out.printf("Inicio [F %d][C %d]\n",fila,columna);
                    
                    switch (posicion) {
                        case 0:
                            if (columna  > tamaño - longitud) direccion = false;
                            System.out.println("Direccion 0");
                            break;
                            
                        case 1:
                            if (columna  < longitud - 1) direccion = false;
                            System.out.println("Direccion 1");
                            break;
                            
                        case 2:
                            if (fila     > tamaño - longitud) direccion = false;
                            System.out.println("Direccion 2");
                            break;
                            
                        case 3:
                            if (fila     < longitud - 1) direccion = false;
                            System.out.println("Direccion 3");
                            break;
                            
                        case 4:
                            if (columna > tamaño - longitud  || fila > tamaño - longitud) direccion = false;
                            break;
                            
                        case 5:
                            if (columna > tamaño - longitud  || fila < longitud - 1) direccion = false;
                            break;
                            
                        case 6:
                            if (columna < longitud - 1   || fila < longitud - 1) direccion = false;
                            break;
                            
                        case 7:
                            if (columna < longitud - 1   || fila > 20 - longitud) direccion = false;
                            break;
                    }
                    
                } while (direccion == false);
                

                
                switch (posicion) {
                    case 0: //Izquierda a Derecha
                        for (int j = columna; j < columna+longitud; j++) {
                            if (sopaDeLetras[fila][j] != null && !sopaDeLetras[fila][j].equals(palabra.substring(j-columna,j-columna+1))) bandera = false;
                        }
                        break;

                    case 1: //Derecha a Izquierda    
                        for (int j = columna; j > columna-longitud; j--) {
                            if (sopaDeLetras[fila][j] != null && !sopaDeLetras[fila][j].equals(palabra.substring(-(j-columna),-(j-columna-1)))) bandera = false;
                        }
                        break;
                        
                    case 2:  //Arriba a Abajo
                        for (int j = fila; j < fila+longitud; j++) {
                            if (sopaDeLetras[j][columna] != null && !sopaDeLetras[j][columna].equals(palabra.substring(j-fila, j-fila+1))) bandera = false;
                        }
                        break;
                        
                    case 3: //Abajo a Arriba
                        for (int j = fila; j > fila-longitud; j--) {
                            System.out.println("Vuelta " + (j-fila));
                            if (sopaDeLetras[j][columna] != null && !sopaDeLetras[j][columna].equals(palabra.substring(-(j-fila), -(j-fila-1)))) bandera = false;
                        }
                        break;
                    
                    case 4: //Diagonal Derecha Inferior
                        for (int j = fila; j < fila+longitud; j++) {
                            for (int k = columna; k < columna+longitud; k++) {
                                if ((j - fila == k - columna) && sopaDeLetras[j][k] != null) {bandera = false;
                                System.out.println("Case 4");}
                            }
                        }
                        break;
                    
                    case 5: //Diagonal Derecha Superior
                        for (int j = fila; j > fila-longitud; j--) {
                            for (int k = columna; k < columna+longitud; k++) {
                                if ((j - fila == -(k - columna)) && sopaDeLetras[j][k] != null) {bandera = false;
                                System.out.println("Case 5");}
                            }
                        }
                        break;
                        
                    case 6: //Diagonal Izquierda Superior
                        for (int j = fila; j > fila-longitud; j--) {
                            for (int k = columna; k > columna-longitud; k--) {
                                if ((j - fila == k - columna) && sopaDeLetras[j][k] != null) {bandera = false;
                                System.out.println("Case 6");}
                            }
                        }
                        break;
                        
                    case 7: //Diagonal Izquierda Inferior
                        for (int j = fila; j < fila+longitud; j++) {
                            for (int k = columna; k > columna-longitud; k--) {
                                if ((j - fila == -(k - columna)) && sopaDeLetras[j][k] != null) {bandera = false;
                                System.out.println("Case 7");}
                            }
                        }
                        break;
                }
            } while (bandera == false);


            
            switch (posicion) {
                case 0: 
                    for (int j = columna; j < columna+longitud; j++) {
                        sopaDeLetras[fila][j] = palabra.substring(pos,pos+1);
                        pos ++;
                    }
                    pos = 0;
                    break;
                    
                case 1:
                    for (int j = columna; j > columna-longitud; j--) {
                        sopaDeLetras[fila][j] = palabra.substring(pos,pos+1);
                        pos ++;
                    }
                    pos = 0;
                    break;
                    
                case 2:
                    for (int j = fila; j < fila+longitud; j++) {
                        sopaDeLetras[j][columna] = palabra.substring(pos,pos+1);
                        pos ++;
                    }
                    pos = 0;
                    break;
                    
                case 3:   
                    for (int j = fila; j > fila-longitud; j--) {
                        sopaDeLetras[j][columna] = palabra.substring(pos,pos+1);
                        pos ++;
                    }
                    pos = 0;
                    break;
                    
                case 4:
                    for (int j = fila; j < fila+longitud; j++) {
                        for (int k = columna; k < columna+longitud; k++) {
                            if (j - fila == k - columna) {
                                sopaDeLetras[j][k] = palabra.substring(pos,pos+1);
                                pos ++;
                            }
                        }
                    }
                    pos = 0;
                    break;
                    
                case 5:
                    for (int j = fila; j > fila-longitud; j--) {
                        for (int k = columna; k < columna+longitud; k++) {
                            if (j - fila == -(k - columna)) {
                                sopaDeLetras[j][k] = palabra.substring(pos,pos+1);
                                pos ++;
                            }
                        }
                    }
                    pos = 0;
                    break;
                    
                case 6:
                    for (int j = fila; j > fila-longitud; j--) {
                        for (int k = columna; k > columna-longitud; k--) {
                            if (j - fila == k - columna) {
                                sopaDeLetras[j][k] = palabra.substring(pos,pos+1);
                                pos ++;
                            }
                        }
                    }
                    pos = 0;
                    break;
                    
                case 7:
                    for (int j = fila; j < fila+longitud; j++) {
                        for (int k = columna; k > columna-longitud; k--) {
                            if (j - fila == -(k - columna)) {
                                sopaDeLetras[j][k] = palabra.substring(pos,pos+1);
                                pos ++;
                            }
                        }
                    }
                    pos = 0;
                    break;
                    
            }
        }
        
        String[] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (sopaDeLetras[i][j] == null) sopaDeLetras[i][j] = abecedario[(int) (Math.random()*abecedario.length)]; //String.valueOf((int) (Math.random() * 9 + 1));
            }
        }
        
        
        
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
