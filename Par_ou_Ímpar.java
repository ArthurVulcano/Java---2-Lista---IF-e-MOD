package lista_mod_e_if_;
import java.util.Scanner;
public class Par_ou_Ímpar {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite x numero");
        int x = sm.nextInt();
        x = x%2;
        if (x == 0){
            System.out.println("Seu numero é par" );
        }
        else {
            System.out.println("Seu numero é impar");
        }
        sm.close();

    }
}
