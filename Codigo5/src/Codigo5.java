// Este programa verifica si un numero ingresado por el usuario es "afortunado" o no,
// siguiendo una serie de reglas especificas y condiciones.
// Se muestra un mensaje que permite la entrada de dato por teclado, se lee la entrada del
// usuario, lo convierte a numero entero y verifica si el numero es igual a 3, 7, 8 o 9,
// si es asi, el numero es ganador. De lo contrario, es un numero no afortunado.

import java.util.Scanner; // Se debe de importar la clase Scanner para permitir la entrada de dato por el teclado

public class Codigo5 {
  public static void main(String[] args) { // Se debe agregar este codigo para que el programa pueda funcionar 

      Scanner s = new Scanner(System.in);// Se debe agregar System.in entre parentesis para que se pueda leer la entrada
      System.out.print("Introduzca un número: "); //Se debe cambiar la comilla simple ' por comilla doble
      String ni = s.nextLine();
      int c = Integer.parseInt(ni); // Se debe cambiar el tipo de dato de string a entero

      int afo = 0;
      int noAfo = 0;

      int number = c; //  Se debe agregar para poder usar el numero
      while (number > 0) { //  Cambiar ni por number
    	  int digito = (int)(number % 10); // Cambiar (int)(ni % 10); por int digito = number % 10, para cambiarlo a entero
    	  if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
        	afo++;
    	  } else {
        	noAfo++;
    	  }
    	  number /= 10; // Cambiar ni por number
      }

      if (afo > noAfo) {
        System.out.println("El " + c + " es un número afortunado."); // Faltaba un t en print 
        
        
      } else {
        System.out.println("El " + c + " no es un número afortunado.");
      }

    }

  }