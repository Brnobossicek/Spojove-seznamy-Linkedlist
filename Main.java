import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prvek hlava = null;
        Prvek ocas = null;

        for (;;) {
            int vstup = sc.nextInt();
            if (vstup == 0)
                break;
                //ulož hodnotu do seznamu
                hlava = new Prvek(vstup, hlava);
                ocas = new Prvek(vstup, hlava);
        }
        //vypiš hodnoty prvků
        while (hlava != null) {
            System.out.println(hlava.hodnota);
            hlava = hlava.dalsiPrvek;
        }

        //vypiš ve správném pořadí

    }
}