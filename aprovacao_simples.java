package lista_mod_e_if_;
import java.util.Scanner;

public class aprovacao_simples {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite sua nota");
        int x = sm.nextInt();
        System.out.println("Digite sua nota");
        int x2 = sm.nextInt();
        double media = (x*x2)/2;
        if (media > 7 ){
            System.out.println("Aprovado: " + media);
        }
        else {
            System.out.println("Reprovado: " + media);
        }
        sm.close();
    }
}
