package lista_mod_e_if_;

import java.util.Scanner;

public class calculadora_de_restos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        double x = sc.nextInt();
        System.out.println("Digite mais um número");
        double x2 = sc.nextInt();
        if (x%2==0){
            System.out.println("Divisão exata");
        }
        else{
            System.out.println("O resto da Divisão é: "+ x%x2);
        }
        sc.close();
    }

}
