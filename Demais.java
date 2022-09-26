//import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * hello
 */
public class Demais {

    //Locale.setDefault(Locale.US);

    public void declaraVariaveis() {

    int acb = 1, cde = 2, fgh = 3;
    System.out.println(acb+cde+fgh);


        // ==============## Wrapper classes ## ==================
    // São classes equivalentes aos tipos primitivos
    // String Double Integer Boolean Character Byte Short Float

    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
    

    public void scanner(){
    // ==============## INPUT ## ==================
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double altura = sc.nextDouble();
        sc.close();
        System.out.printf("%s %d %f",nome, idade, altura);

     // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
    
    public void numerosRandom() {
     // ==============## NUMEROS ALEATÓRIOS ## ==================
        Random number = new Random();
        int n2 = number.nextInt(100); // Gera um número de 0 a 99 aleatoriamente
        int n3 = number.nextInt(2); // Gera um número de 0 a 1 aleatoriamente
        System.out.println(n2);
        System.out.println(n3);
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }


    // Associação, agregação, composição
    // Matrizes

}