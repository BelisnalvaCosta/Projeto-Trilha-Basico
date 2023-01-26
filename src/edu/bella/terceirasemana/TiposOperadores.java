package edu.bella.terceirasemana;

import java.util.Scanner; 
import java.util.Locale;

public class TiposOperadores { 

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            int a, b;
            
            System.out.println("Digite o primeiro valor: ");
            a = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            b = scanner.nextInt();
            
            int somar = somar(a, b);
            int subtrair = subtrair(a, b);
            int multiplicar = multiplicar(a, b);
            int dividir = dividir(a, b);

            System.out.println("somar: " + somar);
            System.out.println("subt: " + subtrair);
            System.out.println("mult: " + multiplicar);
            System.out.println("div: " + dividir);
        }
        
    }
        
        public static int somar(int a, int b) {
            return a + b;
        }
        
        public static int subtrair(int a, int b) {
            return a - b;
        }
        
        public static int multiplicar(int a, int b) {
            return a * b;
        }
        
        public static int dividir(int a, int b) {
            return a / b;
        }
    }    