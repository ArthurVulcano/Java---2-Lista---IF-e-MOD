package lista_mod_e_if_;

import java.util.Scanner;

public class desconto_por_volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o valor");
        int ba = sc.nextInt();
        if (ba>100){
            double desc = ba * 0.1;
            System.out.println("Cliente deve pagar " + (ba - desc));
        }
        else {
            System.out.println("Sem desconto aplicado: "+ ba);
        }
    }
}
