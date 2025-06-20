import java.util.Scanner;

public class prak4_3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bil, hasil;
        System.out.println("Masukan suatu bilangan = ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        System.out.println("Faktorial dari " + bil + " = " + hasil);
        masukan.close();
    }
    
    public static int faktorial(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * faktorial(a - 1);
        }
    }
}
