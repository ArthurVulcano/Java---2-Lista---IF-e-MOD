package lista_mod_e_if_;
import java.util.Scanner;

public class multiplo_de_5 {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite um numero qualquer");
        int x = sm.nextInt();
        if (x%5 == 0){
            System.out.println("Multiplo de 5: " + x);

        }
        else {
            System.out.println("Não multiplo de 5");
        }
        sm.close();

    }
}
