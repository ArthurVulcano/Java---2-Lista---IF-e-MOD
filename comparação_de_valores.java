package lista_mod_e_if_;

import javax.swing.*;
import java.util.Scanner;

public class comparação_de_valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um números");
        int x = sc.nextInt();
        System.out.println("Digite mais um numero");
        int x2 = sc.nextInt();
        if (x < x2){
            System.out.println("O número 2 é o maior"+ x2);
        }
        else{
            System.out.println("O número 1 é o maior");

        }

    }
}
