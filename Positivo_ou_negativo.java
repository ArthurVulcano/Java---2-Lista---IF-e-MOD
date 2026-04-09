package lista_mod_e_if_;

import java.util.Scanner;

public class Positivo_ou_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = sc.nextInt();
        if (x<0){
            System.out.println("Número negativo");
        } else if (x>0) {
            System.out.println("Número postivo");

        }
        else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
