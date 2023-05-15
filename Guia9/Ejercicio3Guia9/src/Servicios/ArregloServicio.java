package Servicios;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author mauro
 */
public class ArregloServicio {
    
    public void InicializarA(Double array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round((Math.random() * 100) * 100.0) / 100.0;
        }
    }
    
    public void InicializarB(Double array1[], Double array2[]){
        for (int i = 0; i < array2.length; i++) {
            if (i < 10) {
                array2[i] = array1[i];
            } else {
                array2[i] = 0.5;
            }
            
        }
    }
    
    public void Mostrar(Double array[]){
        System.out.println(Arrays.toString(array));
    }
    
    public void Ordenar(Double array[]){
        Arrays.sort(array, Collections.reverseOrder());
    }
}
