package lista_mod_e_if_;

import java.util.Scanner;

public class Verificação_de_login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha ");
        int senha = sc.nextInt();
        if (senha!=1234){
            System.out.println("Acesso negado ");
        }
        else {
            System.out.println("Acesso permitido ");
        }
        sc.close();
    }
}
