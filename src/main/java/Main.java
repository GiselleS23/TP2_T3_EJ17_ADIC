/* 17.- Un palíndromo es un número o una frase de texto, que se lee igual hacia delante y hacia atrás. Por ejemplo, cada uno de los siguientes enteros de cinco dígitos son palíndromos: 12321,55555, 45554 y 11611. Escriba un diagrama que lea un entero de cinco dígitos y que determine si es o no un palíndromo.
Sacchetti Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un numero entero positivo de cinco digitos: ");
    int numero = scanner.nextInt();
    int digito1 = numero / 10000;
    int digito2 = (numero / 1000) % 10;
    int digito3 = (numero / 100) % 10;
    int digito4 = (numero / 10) % 10;
    int digito5 = numero % 10;

    if(digito1==digito5 && digito2==digito4){
      System.out.println("El numero es palindromo"); 
    }
    else{
      System.out.println("El numero no es palindromo");
    }
    scanner.close();
  }

}