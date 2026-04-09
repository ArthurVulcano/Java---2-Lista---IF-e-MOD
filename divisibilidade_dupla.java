package lista_mod_e_if_;
import java.util.Scanner;
public class divisibilidade_dupla {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("digite um numero");
        int x = sm.nextInt();
        if ((x%2 == 0) && (x%3 == 0)){
            System.out.println("é divisivel por 2 e 3 ao mesmo tempo: ");
        }
        else {
            System.out.println("Não é divisivel: ");
        }
        sm.close();
    }
}
