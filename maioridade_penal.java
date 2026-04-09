package lista_mod_e_if_;
import java.util.Scanner;

public class maioridade_penal {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int x = sm.nextInt();
        if ((2026-x < 18)){
            System.out.println("Não é maior de idade");
        }
        else {
            System.out.println("Maior de idade");
        }
        sm.close();
    }
}
