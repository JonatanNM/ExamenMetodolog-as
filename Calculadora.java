package Principal;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        int op;
        do {
            mostrarMenu();
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println(
                            "Introduce el primer número:");
                    numero1 = reader.nextInt();

                    System.out.println(
                            "Introduce el segundo número:");
                    numero2 = reader.nextInt();

                    resultado = numero1 + numero2;

                    System.out.println(
                            "La suma es " + numero1 + " + " + numero2 + " = " + resultado);
                    break;
                case 2:
                    System.out.println(
                            "Introduce el primer número:");
                    numero1 = reader.nextFloat();

                    System.out.println(
                            "Introduce el segundo número:");
                    numero2 = reader.nextFloat();

                    resultado = numero1 - numero2;

                    System.out.println(
                            "La resta es " + numero1 + " - " + numero2 + " = " + resultado);
                    break;
                case 3:
                    System.out.println(
                            "Introduce el primer número:");
                    numero1 = reader.nextFloat();

                    System.out.println(
                            "Introduce el segundo número:");
                    numero2 = reader.nextFloat();

                    resultado = numero1 * numero2;

                    System.out.println(
                            "La multiplicación es " + numero1 + " * " + numero2 + " = " + resultado);
                    break;
                case 4:
                    System.out.println(
                            "Introduce el primer número:");
                    numero1 = reader.nextFloat();

                    System.out.println(
                            "Introduce el segundo número:");
                    numero2 = reader.nextFloat();
                    
                    if (numero1>numero2) {
                        aux=numero1;
                        numero1=numero2;
                        numero2=aux;
                        
                    }

                    resultado = numero1 / numero2;

                    System.out.println(
                            "La división es " + numero1 + " / " + numero2 + " = " + resultado);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("debes escribir una opción válida");
            }
        } while (op != 5);
    }

    public static void mostrarMenu() {
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Salir");
    }

}
