/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.Scanner;

/**
 *
 * @author DAM108
 */
public class ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int opcion, num, num1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("--- MENU ENTORNOS DE DESARROLLOS ---");
            System.out.println("- Seleccione una de las siguiente opciones tecleando 1, 2, 3 o 4 -");
            System.out.println("1. Calcular si un número es perfecto .");
            System.out.println("2. Hacer la tabla de multiplicar de un número.   .");
            System.out.println("3. Saber si un numero es exacto o no  .");
            System.out.println("4. Decir si un numero es par o impar .");
            System.out.println("5. .");
            System.out.println("6. Salir.");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Introduce un numero: ");
                    num=teclado.nextInt();
                    if (num%2==0){
                        System.out.println("El numero es exacto");
                        
                    }else{
                        System.out.println("El numero no es exacto");
                    }
                    

                    break;
                case 4:
                  
                    
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("No has seleccionado un número entre 1 y 6");
            }
        } while (opcion != 6);
        
    }
}
    

